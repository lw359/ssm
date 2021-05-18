package com.guigu.service.Zou;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Zou.Z_Goods;

import java.util.List;

public interface Z_GoodsService extends IService<Z_Goods> {
            List<Z_Goods> showAll(String name);
}
