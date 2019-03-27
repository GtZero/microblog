package com.guotao.www.dao;

import com.guotao.www.entity.Content;
import com.guotao.www.util.PageBean;

/**
 * 博文Dao层
 * GuoT 19.3.27
 */
public interface ContentDao {
    /**
     * 通过博文编号，获取一篇完整博文信息
     * @param contentId
     * @return
     */
    Content getOneContent(String contentId);

    /**
     * 获取特定用户的所有博文，使用分页
     * 使用场合:用户获取自己所有博文时
     * @param userId
     * @param contentPageBean
     * @return
     */
    PageBean<Content> getUserAllContent(String userId, PageBean<Content> contentPageBean);

    /**
     * 获取特定用户的所有博文，使用分页
     * 使用场合:管理员获取所有用户博文
     * @param contentPageBean
     * @return
     */
    PageBean<Content> getUserAllContent(PageBean<Content> contentPageBean);

    /**
     * 用户向content表中新添一篇博文
     * @param content
     */
    void insertContent(Content content);

    /**
     * 用户/管理员删除对应编号的博文
     * @param contentId
     */
    void deleteContent(String contentId);

}
