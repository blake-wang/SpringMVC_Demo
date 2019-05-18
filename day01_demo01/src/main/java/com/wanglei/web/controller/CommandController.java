package com.wanglei.web.controller;

import com.wanglei.model.User;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: WangL
 * @Date: 2019/5/18 09:04
 */
public class CommandController extends AbstractCommandController {

    public CommandController() {
        //告诉springmvc把表单数据存在User模型里去
        this.setCommandClass(User.class);
    }

    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, BindException e) throws Exception {
        User user = (User) o;
        System.out.println(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/info");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
