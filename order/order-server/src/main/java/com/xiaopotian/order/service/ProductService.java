package com.xiaopotian.order.service;

import com.xiaopotian.product.common.DecreaseStockInput;
import com.xiaopotian.product.common.ProductInfoOutput;

import java.util.List;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-09-20
 * Time: 20:27
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface ProductService {
    /**
     * 根据商品ID获取商品信息
     * @param productIdList 商品ID
     * @return
     */
    List<ProductInfoOutput> listForOrder(List<String> productIdList);
    /**
     * 扣减库存
     * @param decreaseStockInputList 库存信息
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
