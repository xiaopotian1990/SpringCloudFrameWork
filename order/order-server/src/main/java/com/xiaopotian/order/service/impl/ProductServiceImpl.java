package com.xiaopotian.order.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xiaopotian.order.service.ProductService;
import com.xiaopotian.product.client.ProductClient;
import com.xiaopotian.product.common.DecreaseStockInput;
import com.xiaopotian.product.common.ProductInfoOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-09-20
 * Time: 20:22
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductClient productClient;

    /**
     * 扣减库存
     *
     * @param decreaseStockInputList 库存信息
     */
    @HystrixCommand(
            commandProperties = {
                    //超时时间
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            },
            //建立一个单独的线程池
            threadPoolKey = "decreaseStockThreadPool",
            threadPoolProperties = {
                    //线程池大小
                    @HystrixProperty(name = "coreSize", value = "30"),
                    //线程池前面的队列，该队列控制在线程池中线程繁忙时允许堵塞的请求数，可以对传入的请求进行排队
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            }
    )
    @Override
    public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {
        productClient.decreaseStock(decreaseStockInputList);
    }

    /**
     * 根据商品ID获取商品信息
     *
     * @param productIdList 商品ID
     * @return
     */
    @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            },
            threadPoolKey = "decreaseStockThreadPool",
            threadPoolProperties = {
                    //线程池大小
                    @HystrixProperty(name = "coreSize", value = "30"),
                    //线程池前面的队列，该队列控制在线程池中线程繁忙时允许堵塞的请求数，可以对传入的请求进行排队
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            }
    )
    @Override
    public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
        return productClient.listForOrder(productIdList);
    }
}
