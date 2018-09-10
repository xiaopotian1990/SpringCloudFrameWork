package com.xiaopotian.order.VO;

import lombok.Data;

/**
 * ==========================================
 * Http请求统一返回格式
 * User: 小破天
 * Date: 2018-08-08
 * Time: 23:42
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Data
public class ResultVO<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;
}
