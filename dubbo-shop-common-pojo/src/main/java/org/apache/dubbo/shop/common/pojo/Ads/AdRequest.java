package org.apache.dubbo.shop.common.pojo.Ads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdRequest implements Serializable {
    private List<String> contextKeys;
}

