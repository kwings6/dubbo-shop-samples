package org.apache.dubbo.shop.service;

import org.apache.dubbo.shop.common.pojo.Ads.AdRequest;
import org.apache.dubbo.shop.common.pojo.Ads.AdResponse;

public interface AdService {
    AdResponse getAds(AdRequest request);
}
