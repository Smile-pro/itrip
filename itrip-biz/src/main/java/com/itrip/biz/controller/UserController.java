package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.User;
import com.itrip.biz.service.user.UserService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/user/checkuser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public Dto checkUser(String userCode, String userPassword) {
        User user = service.checkUserLog(userCode, userPassword);
        if (user != null) {
            return DtoUtil.returnSuccess("登陆成功", user);
        } else {
            return DtoUtil.returnFail("登陆失败，账号或密码错误");
        }
    }
}
