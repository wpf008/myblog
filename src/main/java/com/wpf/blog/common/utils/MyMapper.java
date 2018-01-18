package com.wpf.blog.common.utils;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;
/**
 * @Author:wpf
 * @Description :通用mapper FIXME 特别注意，该接口不能被扫描到，否则会出错
 * @Date:Cteated in 4:46 PM 1/18/2018
 * @Modified by
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>, ConditionMapper<T>, IdsMapper<T>,InsertListMapper<T> {

}
