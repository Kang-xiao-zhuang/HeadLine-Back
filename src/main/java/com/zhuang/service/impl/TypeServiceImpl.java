package com.zhuang.service.impl;

import com.zhuang.utils.Result;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuang.pojo.Type;
import com.zhuang.service.TypeService;
import com.zhuang.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 针对表【news_type】的数据库操作Service实现
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
        implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    /**
     * 查询所有类别数据
     *
     * @return Result
     */
    @Override
    public Result findAllTypes() {

        List<Type> types = typeMapper.selectList(null);

        return Result.ok(types);
    }
}




