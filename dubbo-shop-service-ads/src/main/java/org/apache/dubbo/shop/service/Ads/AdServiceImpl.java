package org.apache.dubbo.shop.service.Ads;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.shop.common.pojo.Ads.Ad;
import org.apache.dubbo.shop.common.pojo.Ads.AdRequest;
import org.apache.dubbo.shop.common.pojo.Ads.AdResponse;
import org.apache.dubbo.shop.service.AdService;

import java.util.*;

@DubboService
public class AdServiceImpl implements AdService {
    private static final int MAX_ADS_TO_SERVE = 2;

    private Map<String, Ad[]> adsMap;

    @Override
    public AdResponse getAds(AdRequest request) {
        AdResponse adResponse = new AdResponse();
        List<Ad> ads = new LinkedList<>();
        if(request.getContextKeys()!=null&&request.getContextKeys().size()>0){
            for(String category:request.getContextKeys()){
                Ad[] ad = getAdsByCategory(category);
                if(ad!=null)
                    ads.addAll(Arrays.asList(ad));
            }
            if(ads.size()==0){
                Ad[] ad = getRandomAds();
                ads.addAll(Arrays.asList(ad));
            }
        }
        else{
            Ad[] ad = getRandomAds();
            ads.addAll(Arrays.asList(ad));
        }
        adResponse.setAds(ads);
        return adResponse;
    }

    public AdServiceImpl(){
        createAdsMap();
    }

    private Ad[] getAdsByCategory(String category){
        return adsMap.get(category);
    }
    private Ad[] getRandomAds(){
        Ad[] ad = new Ad[MAX_ADS_TO_SERVE];
        List<Ad> allAds = new ArrayList<>();
        for (Ad[] adArray : adsMap.values()) {
            allAds.addAll(Arrays.asList(adArray));
        }
        Random random = new Random();
        for (int i = 0; i < MAX_ADS_TO_SERVE; i++) {
            int randomIndex = random.nextInt(allAds.size());
            ad[i] = allAds.get(randomIndex);
        }
        return ad;
    }

    private void createAdsMap(){
        this.adsMap = new HashMap<>();

        Ad hairdryer = new Ad("/product/2ZYFJ3GM2N","Hairdryer for sale. 50% off.");
        Ad tankTop = new Ad("/product/66VCHSJNUP","Tank top for sale. 20% off.");
        Ad candleHolder = new Ad("/product/0PUK6V6EV0","Tank top for sale. 20% off.");
        Ad bambooGlassJar = new Ad("/product/9SIQT8TOJO","Bamboo glass jar for sale. 10% off.");
        Ad watch = new Ad("/product/1YMWWN1N4O", "Watch for sale. Buy one, get second kit for free");
        Ad mug = new Ad("/product/6E92ZMYYFZ", "Mug for sale. Buy two, get third one for free");
        Ad loafers = new Ad("/product/L9ECAV7KIM", "Loafers for sale. Buy one, get second one for free");
        adsMap.put("clothing",new Ad[]{tankTop});
        adsMap.put("accessories",new Ad[]{watch});
        adsMap.put("footwear",new Ad[]{loafers});
        adsMap.put("hair",new Ad[]{hairdryer});
        adsMap.put("decor",new Ad[]{candleHolder});
        adsMap.put("kitchen",new Ad[]{bambooGlassJar,mug});
    }

}
