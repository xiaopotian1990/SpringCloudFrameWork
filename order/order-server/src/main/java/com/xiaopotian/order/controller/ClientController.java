package com.xiaopotian.order.controller;

import com.xiaopotian.product.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
public class ClientController {
    //@Autowired
    //private RestTemplate restTemplate;
    /*@Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        String response = productClient.msg();
        //String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        log.info("response={}", response);

        return response;
    }*/
}
