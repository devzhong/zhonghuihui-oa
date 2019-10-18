package com.lz.oa.zhonghuihuioa.dao;

import com.lz.oa.zhonghuihuioa.po.RolePO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchRoleVO;
import com.ne.boot.common.entity.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/25 15:58
 */
@Repository
public interface RoleDao {

    void create(RolePO rolePO);
    void update(RolePO rolePO);
    RolePO findByUuid(String uuid);
    RolePO findByName(String name);
    List<RolePO> all(SearchRoleVO vo, Page page);
    void delete(String uuid);
}
