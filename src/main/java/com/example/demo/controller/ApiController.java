package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
