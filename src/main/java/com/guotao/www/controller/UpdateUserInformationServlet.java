package com.guotao.www.controller;

import com.guotao.www.entity.UserInformation;
import com.guotao.www.service.UserInformationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 修改个人信息的Servlet
 * GuoT 19.4.3
 */
public class UpdateUserInformationServlet extends HttpServlet {

    UserInformationService userInformationService = new UserInformationService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String avatar = request.getParameter("avatar");
        String description = request.getParameter("description");

        UserInformation userInformation = new UserInformation();
        userInformation.setName(name);
        userInformation.setAvatar(avatar);
        userInformation.setDescription(description);

        userInformationService.updateUserInformation(null, userInformation);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
