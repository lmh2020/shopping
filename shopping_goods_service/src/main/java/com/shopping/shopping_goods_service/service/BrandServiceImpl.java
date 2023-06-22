package com.shopping.shopping_goods_service.service;

import com.shopping.shopping_common.exception.BusException;
import com.shopping.shopping_common.pojo.Brand;
import com.shopping.shopping_common.result.CodeEnum;
import com.shopping.shopping_common.service.BrandService;
import com.shopping.shopping_goods_service.mapper.BrandMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单服务生产者
 * 开启事务
 */
@DubboService
@Transactional
public class BrandServiceImpl implements BrandService {
    /**
     * 注入订单dao层接口
     */
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    @Override
    public Brand findById(Long id) {


            return brandMapper.selectById(id);


    }
}
