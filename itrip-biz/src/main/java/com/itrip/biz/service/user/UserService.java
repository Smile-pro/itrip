package com.itrip.biz.service.user;

import com.itrip.beans.pojo.User;

/**
 * 用户业务服务接口
 */
public interface UserService {
    /**
     * 验证用户登录
     */
    User checkUserLog(String userCode, String userPassword);
}
