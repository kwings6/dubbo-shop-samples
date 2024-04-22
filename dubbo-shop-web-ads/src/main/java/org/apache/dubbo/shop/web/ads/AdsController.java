package org.apache.dubbo.shop.web.ads;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.shop.common.ReturnResult;
import org.apache.dubbo.shop.common.pojo.Ads.AdRequest;
import org.apache.dubbo.shop.common.pojo.Ads.AdResponse;
import org.apache.dubbo.shop.service.AdService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/goods")
public class AdsController {

    @DubboReference
    AdService adService;
    @GetMapping("/hot")
    public ReturnResult getAds(AdRequest adRequest){
        AdResponse ads = adService.getAds(adRequest);
        return ReturnResult.success(ads);
    }
}
