package com.xiaopotian.order.repository;

import com.xiaopotian.order.data.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-09
 * Time: 7:43
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
