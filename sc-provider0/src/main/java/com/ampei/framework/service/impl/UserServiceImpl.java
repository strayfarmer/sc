package com.ampei.framework.service.impl;

import com.ampei.framework.model.User;
import com.ampei.framework.mapper.UserMapper;
import com.ampei.framework.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
