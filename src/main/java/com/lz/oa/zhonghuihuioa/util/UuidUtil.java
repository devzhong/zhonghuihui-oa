package com.lz.oa.zhonghuihuioa.util;

import java.util.UUID;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/7/26 14:47
 */
public class UuidUtil {
    public static String generate(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
