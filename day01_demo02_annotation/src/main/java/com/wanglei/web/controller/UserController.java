package com.wanglei.web.controller;

import com.wanglei.model.User;
import com.wanglei.model.UserExt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Auther: WangL
 * @Date: 2019/5/17 21:50
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //使用jstl进行页面数据的回显
    @RequestMapping(value = "/list")
    public String list(Model model) {
        System.out.println(model.getClass());

        //1、模拟数据库的数据
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "海涛", "男", new Date(), 30);
        User user2 = new User(2, "刘军", "男", new Date(), 33);
        User user3 = new User(3, "静静", "女", new Date(), 22);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        //2、把数据存在model
        model.addAttribute("userList", userList);
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

    @RequestMapping(value = "/edit")
    public String edit(int id, Model model) {
        System.out.println("接收到修改的id：" + id);
        //正常的处理步骤是通过id，查询数据库，返回一个User对象，把user对象存在model
        User user1 = new User(1, "海涛", "男", new Date(), 30); //假设从数据库查
        user1.setId(id);
        model.addAttribute("user", user1);
        return "/user/useredit";
    }

    //restfull风格url
    @RequestMapping(value = "/edit1/{id}")
    public String edit1(@PathVariable int id, Model model) {
        System.out.println("接收到修改的id：" + id);
        //正常的处理步骤是通过id，查询数据库，返回一个User对象，把user对象存在model
        User user1 = new User(1, "海涛", "男", new Date(), 30); //假设从数据库查
        user1.setId(id);
        model.addAttribute("user", user1);
        return "/user/useredit";
    }

    //请求转发 ： 跳转到相同控制器
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("请求转发");
        //同一个控制器的转发
        return "forward:list";
    }


    //接收参数，注意，不要使用基本类型，建议使用包装类型
    @RequestMapping("/test2")
    public String test2(@RequestParam(value = "uid", required = true, defaultValue = "789") Integer uid) {
        System.out.println("uid:" + uid);
        return "forward:list";
    }


}
