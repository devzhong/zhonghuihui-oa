package com.lz.oa.zhonghuihuioa.service;

import com.lz.oa.zhonghuihuioa.RestResponse;
import com.lz.oa.zhonghuihuioa.dao.RoleDao;
import com.lz.oa.zhonghuihuioa.error.ServiceError;
import com.lz.oa.zhonghuihuioa.po.RolePO;
import com.lz.oa.zhonghuihuioa.util.UuidUtil;
import com.lz.oa.zhonghuihuioa.vo.OperateRoleVO;
import com.lz.oa.zhonghuihuioa.vo.list.RoleListVO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchRoleVO;
import com.ne.boot.common.entity.Page;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/26 14:34
 */
@Service
public class RoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleService.class);

    @Autowired
    private RoleDao roleDao;

    public RestResponse create(OperateRoleVO vo) {

        try {
            RolePO rolePO = roleDao.findByName(vo.getName());
            if (rolePO != null) {
                return RestResponse.error(ServiceError.ROLE_NAME_EXIST);
            }
            RolePO po = buildRole(new RolePO(), vo);
            po.setCreateTime(new Date());
            po.setUpdateTime(new Date());
            po.setUuid(UuidUtil.generate());
            roleDao.create(po);
            return RestResponse.success();
        } catch (Exception e) {
            LOGGER.error("RoleService create error {}", e);
            return RestResponse.error(ServiceError.UM_SERVICE_ERROR);
        }
    }

    public RestResponse update(OperateRoleVO vo, String uuid) {
        try {
            RolePO rolePO = roleDao.findByUuid(uuid);
            if (rolePO == null) {
                return RestResponse.error(ServiceError.ROLE_NOT_FOUND);
            }
            if (checkRoleExist(vo, uuid)) {
                return RestResponse.error(ServiceError.ROLE_NAME_EXIST);
            }
            RolePO po = buildRole(new RolePO(), vo);
            po.setUpdateTime(new Date());
            po.setUuid(uuid);
            roleDao.update(po);
            return RestResponse.success();
        } catch (Exception e) {
            LOGGER.error("RoleService update error {}", e);
            return RestResponse.error(ServiceError.UM_SERVICE_ERROR);
        }
    }

    public RestResponse<RoleListVO> all(SearchRoleVO vo, Page page) {
        try {
            return RestResponse.success(buildRoleList(roleDao.all(vo, page)), page);
        } catch (Exception e) {
            LOGGER.error("RoleService all error {}", e);
            return RestResponse.error(ServiceError.UM_SERVICE_ERROR);
        }

    }

    public RestResponse delete(String uuid) {
        try {
            RolePO rolePO = roleDao.findByUuid(uuid);
            if (rolePO == null) {
                return RestResponse.error(ServiceError.ROLE_NOT_FOUND);
            }
            roleDao.delete(uuid);
            return RestResponse.success();
        } catch (Exception e) {
            LOGGER.error("RoleService delete error {}", e);
            return RestResponse.error(ServiceError.UM_SERVICE_ERROR);
        }
    }


    private RolePO buildRole(RolePO po, OperateRoleVO vo) {
        po.setName(vo.getName());
        po.setStatus(vo.getStatus());
        po.setDesc(vo.getDesc());
        return po;
    }

    //判断角色名是否存在
    private boolean checkRoleExist(OperateRoleVO vo, String uuid) {
        RolePO rolePO = roleDao.findByName(vo.getName());
        return (rolePO != null) && !rolePO.getUuid().equals(uuid);
    }

    private List<RoleListVO> buildRoleList(List<RolePO> pos) {
        List<RoleListVO> vos = new ArrayList<>();
        for (RolePO po : pos) {
            RoleListVO vo = new RoleListVO();
            vo.setUuid(po.getUuid());
            vo.setName(po.getName());
            vo.setStatus(po.getStatus());
            vo.setDesc(po.getDesc());
            vo.setCreateTime(po.getCreateTime());
            vo.setUpdateTime(po.getCreateTime());
            vos.add(vo);
        }
        return vos;
    }

}
