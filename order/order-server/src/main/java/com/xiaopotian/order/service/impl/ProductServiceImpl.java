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
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
                    //确定断路器是否用于跟踪运行状况和短路请求（如果跳闸） 默认true
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
                    //请求数达到后才计算,用于控制Hystrix考虑在熔断器跳闸之前，在10s内必须发生的连续调用数量
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
                    //在超过requestVolumeThreshold值之后在断路器跳闸之前必须达到的调用失败（由于超时、抛出异常或返回HTTP 500）百分比
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
                    //在断路器跳闸之后，Hystrix允许另一个调用通过已便查看服务是否恢复健康之前Hystrix的休眠时间
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "7000"),
                    //此属性设置统计滚动窗口的持续时间（以毫秒为单位）。对于断路器的使用和发布Hystrix保持多长时间的指标
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds",value = "15000"),
                    //此属性设置rollingstatistical窗口划分的桶数
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets",value = "5")
            },
            //设置新的线程池
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
                    //超时时间
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
                    //确定断路器是否用于跟踪运行状况和短路请求（如果跳闸） 默认true
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
                    //请求数达到后才计算,用于控制Hystrix考虑在熔断器跳闸之前，在10s内必须发生的连续调用数量
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
                    //在超过requestVolumeThreshold值之后在断路器跳闸之前必须达到的调用失败（由于超时、抛出异常或返回HTTP 500）百分比
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
                    //在断路器跳闸之后，Hystrix允许另一个调用通过已便查看服务是否恢复健康之前Hystrix的休眠时间
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "7000"),
                    //此属性设置统计滚动窗口的持续时间（以毫秒为单位）。对于断路器的使用和发布Hystrix保持多长时间的指标
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds",value = "15000"),
                    //此属性设置rollingstatistical窗口划分的桶数
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets",value = "5"),
                    @HystrixProperty(name = "execution.isolation.strategy",value = "THREAD")
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
