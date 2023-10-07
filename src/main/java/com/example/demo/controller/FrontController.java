package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {

    @GetMapping("/home")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/logmein")
    public String loginPage() {
        return "loginPage";
    }

    @GetMapping("/bye")
    @ResponseBody
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("bye");
    }
}
