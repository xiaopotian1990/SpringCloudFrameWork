package com.xiaopotian.product.common;

import lombok.Data;

/**
 * ==========================================
 * 减库存入参
 * User: 小破天
 * Date: 2018-08-10
 * Time: 17:58
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}