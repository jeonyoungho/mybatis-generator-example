package com.example.mybatispractice.controller;

import com.example.mybatispractice.service.ProductService;
import com.example.mybatispractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final UserService userService;
    private final ProductService productService;

    @GetMapping("/users")
    public List<HashMap<String, Object>> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/productDao")
    public List<HashMap<String, Object>> getProductsDao() {
        return productService.getProductsWithDao();
    }
}
