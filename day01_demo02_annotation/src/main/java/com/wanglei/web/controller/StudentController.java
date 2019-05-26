package com.wanglei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: WangL
 * @Date: 2019/5/26 17:47
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    /**
     * 请求转发
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test1")
    public String test1(){
        System.out.println("student控制器");
        //不同控制器转发,指定另一个控制器的url
        return "forward:/user/list";
    }

    /**
     * 重定向：项目内部资源
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test2")
    public String test2(){
        System.out.println("student控制器");
        //重定向
        return "redirect:/user/list";
    }

    /**
     * 重定向：到其他网站
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test3")
    public String test3(){
        System.out.println("student控制器");
        //重定向
        return "redirect:http://www.baidu.com";
    }
}
