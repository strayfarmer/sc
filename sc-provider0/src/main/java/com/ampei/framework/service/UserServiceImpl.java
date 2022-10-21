package com.ampei.framework.service;

import com.ampei.framework.model.User;
import com.ampei.framework.mapper.UserMapper;
import com.ampei.framework.service.UserService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ampei
 * @since 2022-09-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService, IService<User> {

//    @Autowired
//    private UserMapper userMapper;

    @Override
    public String sayhello(String name) {
        return null;
    }
}
