package com.guotao.www.dao.impl;

import com.guotao.www.dao.ContentDao;
import com.guotao.www.entity.Content;
import com.guotao.www.util.PageBean;

public class ContentDaoImpl implements ContentDao {
    @Override
    public Content getOneContent(String contentId) {
        return null;
    }

    @Override
    public PageBean<Content> getUserAllContent(String userId, PageBean<Content> contentPageBean) {
        return null;
    }

    @Override
    public PageBean<Content> getUserAllContent(PageBean<Content> contentPageBean) {
        return null;
    }

    @Override
    public void insertContent(Content content) {

    }

    @Override
    public void deleteContent(String contentId) {

    }
}
