package org.apache.dubbo.shop.mapper.NewGoods;

import org.apache.dubbo.shop.common.pojo.NewGoodsList.NewGoodsList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewGoodsMapper {
    public NewGoodsList getNewGoodsList();
}
