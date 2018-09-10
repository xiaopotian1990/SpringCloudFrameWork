package com.xiaopotian.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-10
 * Time: 15:00
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@RestController
public class ServiceController {
    @GetMapping("/msg")
    public String msg() {
        return "xiaopotian";
    }
}
