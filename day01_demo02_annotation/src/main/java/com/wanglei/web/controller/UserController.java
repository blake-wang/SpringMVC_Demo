package com.wanglei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: WangL
 * @Date: 2019/5/17 21:50
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public String list() {
        return "user/userlist";
    }

    @RequestMapping("/add")
    public String add() {
        return "user/userlist";
    }

    @RequestMapping("/update")
    public String update() {
        return "user/userlist";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "user/userlist";
    }

    @RequestMapping("/query")
    public String query() {
        return "user/userlist";
    }

}
