package com.xiaopotian.order.enums;

import lombok.Getter;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-09
 * Time: 7:39
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
