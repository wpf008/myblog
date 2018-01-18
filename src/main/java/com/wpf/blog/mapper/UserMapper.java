package com.wpf.blog.mapper;

import com.wpf.blog.common.utils.MyMapper;
import com.wpf.blog.model.User;
/**
 * @Author:wpf
 * @Description
 * @Date:Cteated in 4:46 PM 1/18/2018
 * @Modified by
 */
public interface UserMapper extends MyMapper<User> {

    User findOne();
}
