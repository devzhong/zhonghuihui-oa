package com.lz.oa.zhonghuihuioa.dao;

import com.lz.oa.zhonghuihuioa.po.ModuleGroupPO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchModuleGroupVO;
import com.ne.boot.common.entity.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/30 10:00
 */
@Repository
public interface ModuleGroupDao {

    void create(ModuleGroupPO po);
    void delete(String uuid);
    ModuleGroupPO findByUuid(String uuid);
    List<ModuleGroupPO> all(SearchModuleGroupVO vo, Page page);

}
