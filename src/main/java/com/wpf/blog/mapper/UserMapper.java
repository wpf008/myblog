package com.wpf.blog.mapper;

import com.wpf.blog.common.utils.MyMapper;
import com.wpf.blog.model.User;

public interface UserMapper extends MyMapper<User> {

    User findOne();
}
