package com.drhui.rabbit.user.service.impl;

import com.drhui.rabbit.user.mapper.UserMapper;
import com.drhui.rabbit.user.model.UmsMember;
import com.drhui.rabbit.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }
}
