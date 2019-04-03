package com.guotao.www.controller;

import com.guotao.www.service.ContentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除博文操作的Servlet
 * GuoT 19.4.3
 */
public class DeleteContentServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contentId = request.getParameter("contentId");
        contentService.deleteContent(contentId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
