package com.guotao.www.service;

import com.guotao.www.constants.BlogConstant;
import com.guotao.www.dao.ContentDao;
import com.guotao.www.dao.impl.ContentDaoImpl;
import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Content;
import com.guotao.www.util.IdUtil;
import com.guotao.www.util.PageBean;

import java.util.Date;

/**
 * GuoT 19.3.28
 */
public class ContentService {

    ContentDao contentDao = new ContentDaoImpl();

    /**
     * 用户向content表中新添一篇博文
     * @param content
     */
    public void insertContent(UserLoginDTO userLoginDTO, Content content){
        content.setContentId(IdUtil.getUUID());
        content.setContentUserId(userLoginDTO.getUserId());
        content.setContentUserName(userLoginDTO.getName());
        content.setContentNumber(BlogConstant.INIT_VISIT_NUMBER);
        content.setIsDelete(BlogConstant.ISDELETE_NO);
        content.setCreatedTime(new Date());
        contentDao.insertContent(content);
    };

    /**
     * 用户/管理员删除对应编号的博文
     * @param contentId
     */
    public void deleteContent(String contentId){
        contentDao.deleteContent(contentId);
    };

    /**
     * 通过博文编号，获取一篇完整博文信息
     * @param contentId
     * @return
     */
    public Content getOneContent(String contentId){
        Content oneContent = contentDao.getOneContent(contentId);
        return oneContent;
    };

    /**
     * 获取特定用户的所有博文，使用分页
     * 使用场合:用户获取自己所有博文时
     * 传入的page参数，当前页，一页条数
     * @param userId
     * @param contentPageBean
     * @return
     */
    public PageBean<Content> getUserAllContent(String userId, PageBean<Content> contentPageBean){
        return contentDao.getUserAllContent(userId, contentPageBean);
    };

    /**
     * 获取所有用户的所有博文，使用分页
     * 使用场合:管理员获取所有用户博文
     * @param contentPageBean
     * @return
     */
    public PageBean<Content> getAllContent(PageBean<Content> contentPageBean){
        return contentDao.getAllContent(contentPageBean);
    };
}
