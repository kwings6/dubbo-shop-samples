package org.apache.dubbo.shop.service.newGoods;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.shop.common.pojo.NewGoodsList.NewGoodsList;
import org.apache.dubbo.shop.mapper.NewGoods.NewGoodsMapper;
import org.apache.dubbo.shop.service.NewGoodsService;

@DubboService
public class NewGoodsServiceImpl implements NewGoodsService {
    @DubboReference
    NewGoodsMapper newGoodsMapper;
    @Override
    public NewGoodsList newGoodsListResult() {
        return null;
    }
}
