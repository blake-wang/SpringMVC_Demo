package com.wanglei.web.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: WangL
 * @Date: 2019/5/18 08:43
 */
public class HttpController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "wanglei");
        request.getRequestDispatcher("/WEB-INF/views/user/userlist.jsp").forward(request, response);
    }
}
