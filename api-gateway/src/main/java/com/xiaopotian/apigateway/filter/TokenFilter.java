package com.xiaopotian.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-18
 * Time: 12:20
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Component
public class TokenFilter extends ZuulFilter {
    /**
     * 过滤器类型 PRE_TYPE：前置过滤器 ROUTE_TYPE：路由过滤器 POST_TYPE：后置过滤器
     * @return 过滤器类型
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 返回一个数值，指示不同类型的过滤器的执行顺序
     * @return 数值
     */
    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    /**
     * 返回一个布尔值来指示该过滤器是否要执行
     * @return 布尔值
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 每次服务通过过滤器时执行的代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;
    }
}
