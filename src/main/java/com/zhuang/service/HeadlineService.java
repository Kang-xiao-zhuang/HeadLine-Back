package com.zhuang.service;

import com.zhuang.pojo.Headline;
import com.zhuang.pojo.vo.PortalVo;
import com.zhuang.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【news_headline】的数据库操作Service
 */
public interface HeadlineService extends IService<Headline> {

    /**
     * 首页数据查询
     * @param portalVo
     * @return
     */
    Result findNewsPage(PortalVo portalVo);

    /**
     * 根据id查询详情
     * @param hid
     * @return
     */
    Result showHeadlineDetail(Integer hid);


    /**
     * 发布头条方法
     * @param headline
     * @return
     */
    Result publish(Headline headline,String token);

    /**
     * 修改头条数据
     * @param headline
     * @return
     */
    Result updateData(Headline headline);
}
