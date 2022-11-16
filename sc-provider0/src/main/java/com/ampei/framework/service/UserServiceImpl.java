package com.ampei.framework.service;

import com.ampei.framework.model.User;
import com.ampei.framework.mapper.UserMapper;
import com.ampei.framework.service.UserService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ampei
 * @since 2022-09-14
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserServiceImpl implements UserService{
//     extends ServiceImpl<UserMapper, User> implements UserService, IService<User>

    @Resource
    private UserMapper userMapper;

    @Override
    @RequestMapping("/findByName")
    public String findByName(String name) {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        return "success";
    }


}
