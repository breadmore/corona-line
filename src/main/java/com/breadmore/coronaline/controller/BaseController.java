package com.breadmore.coronaline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {
//ErrorController 에러 컨트롤을 커스텀 하겠다~

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
