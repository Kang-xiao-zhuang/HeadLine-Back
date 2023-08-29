package com.zhuang.service;

import com.zhuang.pojo.User;
import com.zhuang.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【news_user】的数据库操作Service
 */
public interface UserService extends IService<User> {

    /**
     * 登录业务
     *
     * @param user User
     * @return Result
     */
    Result login(User user);

    /**
     * 根据token获取用户数据
     *
     * @param token String
     * @return Result
     */
    Result getUserInfo(String token);

    /**
     * 检查账号是否可用
     *
     * @param username 账号
     * @return Result
     */
    Result checkUserName(String username);

    /**
     * 注册业务
     *
     * @param user User
     * @return Result
     */
    Result regist(User user);
}
