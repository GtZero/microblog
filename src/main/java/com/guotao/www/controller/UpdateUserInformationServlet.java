package com.guotao.www.controller;

import com.guotao.www.dto.UserLoginDTO;
import com.guotao.www.entity.UserInformation;
import com.guotao.www.service.UserInformationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 修改个人信息的Servlet
 * GuoT 19.4.3
 */
public class UpdateUserInformationServlet extends HttpServlet {

    UserInformationService userInformationService = new UserInformationService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String description = request.getParameter("description");

        UserInformation userInformation = new UserInformation();
        userInformation.setName(name);
        userInformation.setEmail(email);
        userInformation.setPhone(phone);
        userInformation.setDescription(description);

        HttpSession session = request.getSession();
        UserLoginDTO userLoginDTO = (UserLoginDTO) session.getAttribute("User");
        userInformation.setUserId(userLoginDTO.getUserId());

        userLoginDTO.setName(name);
        userLoginDTO.setEmail(email);
        userLoginDTO.setPhone(phone);
        userLoginDTO.setDescription(description);
        userInformationService.updateUserInformation(null, userInformation);
        session.setAttribute("User",userLoginDTO);
        response.sendRedirect(request.getContextPath()+"/updateUser.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
