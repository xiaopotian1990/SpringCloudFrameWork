package com.xiaopotian.order.service;

import com.xiaopotian.order.dto.OrderDTO;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-09
 * Time: 7:56
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 完结订单(只能卖家操作)
     *
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);
}
