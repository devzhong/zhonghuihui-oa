package com.lz.oa.zhonghuihuioa.dao;

import com.lz.oa.zhonghuihuioa.po.GroupPO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchGroupVO;
import com.ne.boot.common.entity.Page;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/29 18:26
 */
public interface GroupDao {

    void create(GroupPO po);
    void delete(String uuid);
    GroupPO findByUuid(String uuid);
    List<GroupPO> all(SearchGroupVO vo, Page page);

}
