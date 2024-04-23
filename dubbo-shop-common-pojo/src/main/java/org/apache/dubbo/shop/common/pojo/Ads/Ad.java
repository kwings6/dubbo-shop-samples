package org.apache.dubbo.shop.common.pojo.Ads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ad implements Serializable {
    // url to redirect to when an ad is clicked.
    String redirect_url;

    // short advertisement text to display.
    String text;

}
