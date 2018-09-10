package com.xiaopotian.order.dto;

import lombok.Data;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-10
 * Time: 22:08
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Data
public class CartDTO {
    /**
     * 商品ID
     */
    private String productId;
    /**
     * s商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
