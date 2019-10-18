package com.lz.oa.zhonghuihuioa.po;

import java.io.Serializable;
import java.util.Date;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/26 19:33
 */
public class AccountPO implements Serializable {
    private static final long serialVersionUID = 7718643537291723439L;
    private String uuid;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
