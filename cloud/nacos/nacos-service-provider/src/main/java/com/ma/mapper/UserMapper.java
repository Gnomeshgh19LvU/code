package com.ma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ma.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
