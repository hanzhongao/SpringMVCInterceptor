package com.hza.comtroller;

import com.hza.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Create by hza
 * 2019-10-11 12:27
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {
        return "login" ;
    }

    @RequestMapping(value = "/logined")
    public String logined(@RequestParam(value = "account") String account,
                          @RequestParam(value = "password") String password,
                          HttpSession session) {

        if (account.equals("hza") && password.equals("123")) {
            User user = new User() ;
            user.setAccount(account);
            user.setPassword(password);
            session.setAttribute("session_user", user);
            return "redirect:/user/search" ;
        } else {
            return "redirect:/login";
        }
    }
}
