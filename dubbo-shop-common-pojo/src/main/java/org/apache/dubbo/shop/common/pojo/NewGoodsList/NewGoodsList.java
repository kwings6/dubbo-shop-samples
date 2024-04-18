package org.apache.dubbo.shop.common.pojo.NewGoodsList;

import lombok.Data;

@Data
public class NewGoodsList {
    /**
     * 推荐别名
     */
    private String alt;
    /**
     * 推荐id
     */
    private String id;
    /**
     * 推荐图片
     */
    private String picture;
    /**
     * 推荐标题
     */
    private String title;
}
