package com.lz.oa.zhonghuihuioa.po;

import java.io.Serializable;
import java.util.Date;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/29 18:03
 */
public class ResourcePO implements Serializable {
    private static final long serialVersionUID = 7718643537291723439L;
    private String uuid;
    private String name;
    private String uri;
    private String category;
    private String ancestorIds;
    private String systemId;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAncestorIds() {
        return ancestorIds;
    }

    public void setAncestorIds(String ancestorIds) {
        this.ancestorIds = ancestorIds;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
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
