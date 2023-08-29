package com.zhuang.service;

import com.zhuang.pojo.Type;
import com.zhuang.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【news_type】的数据库操作Service
 */
public interface TypeService extends IService<Type> {

    /**
     * 查询所有类别数据
     *
     * @return Result
     */
    Result findAllTypes();
}
