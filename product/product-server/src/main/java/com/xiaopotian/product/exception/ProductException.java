package com.xiaopotian.product.exception;

import com.xiaopotian.product.enums.ResultEnum;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-10
 * Time: 22:23
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

