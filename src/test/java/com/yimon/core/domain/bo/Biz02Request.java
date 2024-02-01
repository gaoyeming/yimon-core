package com.yimon.core.domain.bo;

import com.yimon.core.pojo.ABodyPojo;

/**
 * @author: ym.gao
 * @description: 业务1请求参数
 * @date: 2024/2/1 14:13
 */
public class Biz02Request extends ABodyPojo {

    private String biz02_request;

    public String getBiz02_request() {
        return biz02_request;
    }

    public void setBiz02_request(String biz02_request) {
        this.biz02_request = biz02_request;
    }
}
