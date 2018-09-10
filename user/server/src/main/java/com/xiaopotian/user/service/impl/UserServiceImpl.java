package com.xiaopotian.user.service.impl;

import com.xiaopotian.user.dataobject.UserInfo;
import com.xiaopotian.user.repository.UserInfoRepostory;
import com.xiaopotian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-20
 * Time: 23:26
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepostory repostory;

    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return repostory.findByOpenid(openid);
    }
}
