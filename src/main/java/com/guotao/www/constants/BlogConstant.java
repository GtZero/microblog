package com.guotao.www.constants;

/**
 * 项目中常用的常量
 * GuoT 19.3.28
 */
public class BlogConstant {
    /**
     * 逻辑删除标识 0对应没删 1对应删了
     */
    public static final String ISDELETE_NO = "0";
    public static final String ISDELETE_YES = "1";
    /**
     * 文章Content初始化访客数量
     */
    public static final String INIT_VISIT_NUMBER = "0";
    /**
     * 用户注册默认使用的昵称
     */
    public static final String USER_DEFAULT_NAME = "VTMERBlog" + System.currentTimeMillis();
    /**
     * 注册后的初始角色编号id
     */
    public static final String USER_DEFAULT_ROLE_ID = "1";
}
