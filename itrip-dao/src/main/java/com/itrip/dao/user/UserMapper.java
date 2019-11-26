package com.itrip.dao.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户数据访问接口
 */
public interface UserMapper {
    /**
     * 账号查询用户
     */
    User getUserByCode(@Param("userCode") String userCode);
}
