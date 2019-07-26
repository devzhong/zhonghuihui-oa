package com.lz.oa.zhonghuihuioa.error;

import com.ne.boot.common.exception.IError;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/25 15:46
 */
public enum  ServiceError implements IError {
    UM_SERVICE_ERROR("9999", "内部服务错误"),
    ROLE_NAME_EXIST("1001", "角色名已经存在"),
    ROLE_NAME_NOT_NULL("1002", "角色名不能为空"),
    ROLE_STATUS_NOT_NULL("1003", "角色状态不能为空"),
    ROLE_NOT_FOUND("1004", "没有找到对应的角色"),


    ;

    String errorCode;
    String errorMessage;
    private static final String ns = "OA";

    ServiceError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getNamespace() {
        return ns;
    }

    @Override
    public String getErrorCode() {
        return ns + "_" + errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
