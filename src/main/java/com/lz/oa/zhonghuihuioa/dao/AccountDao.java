package com.lz.oa.zhonghuihuioa.dao;

import com.lz.oa.zhonghuihuioa.po.AccountPO;
import com.lz.oa.zhonghuihuioa.vo.search.SearchAccountVO;
import com.ne.boot.common.entity.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/26 19:38
 */
@Repository
public interface AccountDao {

    void create(AccountPO po);
    void delete(String uuid);
    AccountPO findByUuid(String uuid);
    List<AccountPO> all(SearchAccountVO vo, Page page);
}
