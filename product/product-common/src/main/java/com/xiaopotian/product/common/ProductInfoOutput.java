package com.xiaopotian.product.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ==========================================
 * 商品对外暴漏信息
 * User: 小破天
 * Date: 2018-08-10
 * Time: 17:58
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Data
public class ProductInfoOutput {

    private String productId;

    /**
     * 名字.
     */
    private String productName;

    /**
     * 单价.
     */
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    private Integer productStock;

    /**
     * 描述.
     */
    private String productDescription;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 状态, 0正常1下架.
     */
    private Integer productStatus;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
