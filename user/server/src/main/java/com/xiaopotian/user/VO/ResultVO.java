package com.xiaopotian.user.VO;

import lombok.Data;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-20
 * Time: 23:26
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
