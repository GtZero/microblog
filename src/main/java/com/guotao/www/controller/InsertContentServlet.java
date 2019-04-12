package com.guotao.www.controller;

import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.Content;
import com.guotao.www.service.ContentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 插入博文操作的Servlet
 * GuoT 19.4.3
 */
public class InsertContentServlet extends HttpServlet {

    ContentService contentService = new ContentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserLoginDTO userLoginDTO = (UserLoginDTO) session.getAttribute("User");
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String displayImage = request.getParameter("displayImage");
        String contentData = request.getParameter("contentData");
        String contentType = request.getParameter("contentType");
        Content content = new Content();
        content.setContentTitle(title);
        content.setDescription(description);
        content.setDisplayImage(displayImage);
        content.setContentData(contentData);
        content.setContentTypeId(contentType);
        contentService.insertContent(userLoginDTO, content);
        response.sendRedirect(request.getContextPath() + "/content/getUserAll?currentPage=1&pageSize=8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
