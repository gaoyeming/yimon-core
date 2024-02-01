package com.yimon.core.domain.bo;

import com.yimon.core.pojo.ABodyPojo;

/**
 * @author: ym.gao
 * @description: 业务1请求参数
 * @date: 2024/2/1 14:13
 */
public class Biz02Response extends ABodyPojo {

    private String biz02_response;

    public String getBiz02_response() {
        return biz02_response;
    }

    public void setBiz02_response(String biz02_response) {
        this.biz02_response = biz02_response;
    }
}
