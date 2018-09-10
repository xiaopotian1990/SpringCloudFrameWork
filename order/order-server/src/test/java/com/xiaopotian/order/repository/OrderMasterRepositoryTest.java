package com.xiaopotian.order.repository;

import com.xiaopotian.order.OrderApplicationTests;
import com.xiaopotian.order.data.OrderMaster;
import com.xiaopotian.order.enums.OrderStatusEnum;
import com.xiaopotian.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("小破天");
        orderMaster.setBuyerPhone("18518095396");
        orderMaster.setBuyerAddress("山东济宁");
        orderMaster.setBuyerOpenid("7654321");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}