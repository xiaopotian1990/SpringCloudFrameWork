package com.xiaopotian.order.utils;

import com.xiaopotian.order.VO.ResultVO;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-08
 * Time: 23:56
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
