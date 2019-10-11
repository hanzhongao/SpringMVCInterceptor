package com.hza.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by hza
 * 2019-10-11 11:57
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(){
        return "index" ;
    }
}
