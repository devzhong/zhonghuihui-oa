package com.lz.oa.zhonghuihuioa.po;

import java.io.Serializable;
import java.util.Date;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/29 18:06
 */
public class SystemPO implements Serializable {
    private static final long serialVersionUID = 7718643537291723439L;
    private String uuid;
    private String name;
    private String sysId;
    private Date createTime;
    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
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
