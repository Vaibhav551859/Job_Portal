package com.online_portal.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value="/admin")
public class jobController {
    @GetMapping("/")
    public String set()
    {
        return "index";
    }
}
