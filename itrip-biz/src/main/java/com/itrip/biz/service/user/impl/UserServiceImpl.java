package com.itrip.biz.service.user.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.user.UserService;
import com.itrip.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User checkUserLog(String userCode, String userPassword) {
        User user = mapper.getUserByCode(userCode);
        if (user != null && userPassword.equals(user.getUserPassword())) {
            return user;
        }
        return null;
    }
}
