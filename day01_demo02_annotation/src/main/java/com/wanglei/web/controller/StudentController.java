package com.wanglei.web.controller;

import com.wanglei.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: WangL
 * @Date: 2019/5/26 17:47
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    /**
     * 请求转发
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("student控制器");
        //不同控制器转发,指定另一个控制器的url
        return "forward:/user/list";
    }

    /**
     * 重定向：项目内部资源
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test2")
    public String test2() {
        System.out.println("student控制器");
        //重定向
        return "redirect:/user/list";
    }

    /**
     * 重定向：到其他网站
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:01
     */
    @RequestMapping("/test3")
    public String test3() {
        System.out.println("student控制器");
        //重定向
        return "redirect:http://www.baidu.com";
    }

    /**
     * 学生注册
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:50
     */
    @RequestMapping("/toReg")
    public String toReg(Student stu) {
        System.out.println(stu);
        return "/stu/register";
    }

    /**
     * 处理前端表单提交过来的json数据
     * RequestBody的作用是：把json数据转成模型对象
     * ResponseBody的作用是：返回json数据，把对象转成json字符串返回客户端
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:50
     */
    @RequestMapping("/save")
    public @ResponseBody Student save(@RequestBody Student stu) {
        System.out.println("json数据转成模型:" + stu);
        return stu;
    }

    /**
     * 处理前端表单提交过来的json数据
     *
     * @param:
     * @return:
     * @auther: WangL
     * @date: 2019/5/26 18:50
     */
    @RequestMapping("/list")
    public String list(Student stu) {
        System.out.println(stu);
        return "/stu/list";
    }
}
