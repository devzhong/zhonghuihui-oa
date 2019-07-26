package com.lz.oa.zhonghuihuioa.controller.v1;

import com.lz.oa.zhonghuihuioa.RestResponse;
import com.lz.oa.zhonghuihuioa.error.ServiceError;
import com.lz.oa.zhonghuihuioa.service.RoleService;
import com.lz.oa.zhonghuihuioa.vo.OperateRoleVO;
import com.lz.oa.zhonghuihuioa.vo.list.RoleListVO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchRoleVO;
import com.ne.boot.common.entity.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/26 14:54
 */
@RestController
@RequestMapping(value = "/api/v1/*")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    public RestResponse create(@RequestBody OperateRoleVO vo){
        if (StringUtils.isEmpty(vo.getName())){
            return RestResponse.error(ServiceError.ROLE_NAME_NOT_NULL);
        }
        if (StringUtils.isEmpty(vo.getStatus())){
            return RestResponse.error(ServiceError.ROLE_STATUS_NOT_NULL);
        }
        return roleService.create(vo);
    }

    @RequestMapping(value = "/roles/{uuid}", method = RequestMethod.PUT)
    public RestResponse update(@RequestBody OperateRoleVO vo, @PathVariable("uuid") String uuid){
        if (StringUtils.isEmpty(vo.getName())){
            return RestResponse.error(ServiceError.ROLE_NAME_NOT_NULL);
        }
        if (StringUtils.isEmpty(vo.getStatus())){
            return RestResponse.error(ServiceError.ROLE_STATUS_NOT_NULL);
        }
        return roleService.update(vo, uuid);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public RestResponse<RoleListVO> all(@ApiIgnore SearchRoleVO vo, Page page){
        return roleService.all(vo, page);
    }

    @RequestMapping(value = "/roles/{uuid}", method = RequestMethod.DELETE)
    public RestResponse delete(@PathVariable("uuid") String uuid){
        return roleService.delete(uuid);
    }
}
