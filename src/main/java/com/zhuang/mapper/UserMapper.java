package com.zhuang.mapper;

import com.zhuang.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 针对表【news_user】的数据库操作Mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




