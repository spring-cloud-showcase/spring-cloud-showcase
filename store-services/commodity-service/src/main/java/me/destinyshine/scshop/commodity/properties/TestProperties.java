package me.destinyshine.scshop.commodity.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by liujianyu.ljy on 17/7/8.
 *
 * @author liujianyu.ljy
 * @date 2017/07/08
 */
@ConfigurationProperties(prefix = "test")
@Component
@RefreshScope
public class TestProperties {

    private String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
