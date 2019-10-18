package com.lz.oa.zhonghuihuioa.po;

import java.io.Serializable;
import java.util.Date;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/29 18:08
 */
public class UserGroupPO implements Serializable {
    private static final long serialVersionUID = 7718643537291723439L;
    private String uuid;
    private String userId;
    private String groupId;
    private Date createTime;
    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
