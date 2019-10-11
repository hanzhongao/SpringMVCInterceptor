package com.hza.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Create by hza
 * 2019-10-11 12:20
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/search")
    public String search(HttpSession session) {
        System.out.println("================search================");
        return "user/search" ;
    }

    @RequestMapping(value = "/updatepwd")
    public String updatepwd(HttpSession session) {
        System.out.println("================updatepwd================");
        return "user/updatepwd" ;
    }

    @RequestMapping(value = "/updatepic")
    public String updatepic(HttpSession session) {
        System.out.println("================updatepic================");
        return "user/updatepic" ;
    }

    @RequestMapping(value = "/updatebackgroun/{id}")
    public String updatebackground(HttpSession session) {
        System.out.println("================updatebackground================");
        return "user/updatebackground" ;
    }
}
