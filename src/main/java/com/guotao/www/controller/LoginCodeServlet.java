package com.guotao.www.controller;

import com.guotao.www.util.CodeUtil;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * 验证码生成控制器
 * GuoT 19.4.2
 */
public class LoginCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,Object> map = CodeUtil.generateCodeAndPic();
        BufferedImage image = (BufferedImage) map.get("codePic");
        String code = (String) map.get("code");
        HttpSession session = req.getSession();
        session.setAttribute("imageCode", code);

        resp.setContentType("image/png");
        OutputStream out = resp.getOutputStream();
        ImageIO.write(image, "png", out);
    }
}
