package com.n1belungen.controller;

import com.n1belungen.entity.Admin;
import com.n1belungen.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;


    /**
     * 管理员登录
     * @param user_name
     * @param user_pwd
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String judgeAdminLogin(@RequestParam("user_name") String user_name , @RequestParam("user_pwd")String user_pwd , HttpSession session, Model model){
        List<Admin> admins = adminService.judgeAdminLogin(user_name, user_pwd);
        // 判断用户名 和 密码 是否正确
        // admins中存在数据 证明用户名和密码正确
        if (admins.size() != 0) {
            //将 username 存放到 session 中
            session.setAttribute("username", user_name);
            return "redirect:/main.html";
        }
        else {
            //回显
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }

    /**
     * 管理员注销
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
