package com.wanglei.web.controller;

import com.wanglei.model.User;
import com.wanglei.model.UserExt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Date;

/**
 * @Auther: WangL
 * @Date: 2019/5/17 21:50
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String list() {
        return "/user/userlist";
    }

    @RequestMapping(value = "/toRegister")
    public String toRegister() {
        return "/user/register";
    }


    /**
     * 第一种接收表单的方式：
     * 直接在参数中接收表单传过来的数据
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/25 16:12
     */
    @RequestMapping(value = "/register")
    public String register(String username, String password, int age, String gender, Date birthday, String[] hobbyIds) {
        System.out.println("方法参数");
        System.out.println(username);
        System.out.println(password);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(birthday);
        System.out.println(Arrays.toString(hobbyIds));
        return "/user/info";
    }

    /**
     * 第二种接收表单的方式：
     * 直接将表单的数据封装成一个model
     * 默认日期格式 月/日年 10/10/2018
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/25 16:12
     */
    @RequestMapping(value = "/register2")
    public String register2(User user) {
        System.out.println("模型");
        System.out.println(user);
        return "/user/info";
    }


    /**
     * 第三种接收表单的方式：
     * 相当于模型里面有模型
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/25 16:12
            */
    @RequestMapping(value = "/register3")
    public String register3(UserExt userExt) {
        System.out.println("模型中的模型");
        System.out.println(userExt);
        return "/user/info";
    }

    /**
     * 第四种接收表单的方式：
     * 模型中的集合
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/25 16:12
     */
    @RequestMapping(value = "/register4")
    public String register4(UserExt userExt) {
        System.out.println("模型中的集合");
        System.out.println(userExt.getUserList());
        return "/user/info";
    }

    /**
     * 第五种接收表单的方式：
     * 模型中的map
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/25 16:12
     */
    @RequestMapping(value = "/register5")
    public String register5(UserExt userExt) {
        System.out.println("模型中的map");
        System.out.println(userExt.getUserMap());
        return "/user/info";
    }


}
