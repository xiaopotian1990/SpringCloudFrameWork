package com.xiaopotian.product.enums;

import lombok.Getter;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-08
 * Time: 23:25
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
