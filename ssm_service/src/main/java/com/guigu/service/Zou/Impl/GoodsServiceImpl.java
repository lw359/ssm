package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Zou.Z_Goods;
import com.guigu.service.Zou.Z_GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Z_Goods>
        implements Z_GoodsService {

@Autowired
 GoodsMapper goodsMapper;
    @Override
    public List<Z_Goods> showAll(String name) {
        List<Z_Goods> goods = goodsMapper.showAll(name);
        return goods;
    }
}
