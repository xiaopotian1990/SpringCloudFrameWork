package com.xiaopotian.user.service;

import com.xiaopotian.user.dataobject.UserInfo;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-20
 * Time: 23:26
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
public interface UserService {

    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
