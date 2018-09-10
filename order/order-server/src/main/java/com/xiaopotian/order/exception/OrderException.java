package com.xiaopotian.order.exception;

import com.xiaopotian.order.enums.ResultEnum;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-09
 * Time: 20:38
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
