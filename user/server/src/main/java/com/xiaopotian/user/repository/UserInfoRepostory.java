package com.xiaopotian.user.repository;

import com.xiaopotian.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ==========================================
 * Created with IntelliJ IDEA.
 * User: 小破天
 * Date: 2018-08-20
 * Time: 23:26
 * 博客园：http://www.cnblogs.com/xiaopotian/
 * ===========================================
 */

public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);
}
