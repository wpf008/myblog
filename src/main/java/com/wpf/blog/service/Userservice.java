package com.wpf.blog.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpf.blog.mapper.UserMapper;
import com.wpf.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @Author:wpf
 * @Description
 * @Date:Cteated in 4:46 PM 1/18/2018
 * @Modified by
 */
@Service
public class Userservice {

    @Autowired
    private UserMapper userMapper;

    public PageInfo<User> findAll(){
        PageHelper.startPage(1, 3);
        Page<User> users = (Page<User>)userMapper.selectAll();
        return  new PageInfo<>(users);
    }
}
