package com.guotao.www.util;

import java.util.UUID;

/**
 * Id生成工具类
 * GuoT 19.3.28
 */
public class IdUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
