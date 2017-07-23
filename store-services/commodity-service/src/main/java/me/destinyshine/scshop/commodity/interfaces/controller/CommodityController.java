package me.destinyshine.scshop.commodity.interfaces.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.google.common.collect.ImmutableMap;
import me.destinyshine.scshop.commodity.application.CommodityService;
import me.destinyshine.scshop.commodity.domain.Commodity;
import me.destinyshine.scshop.commodity.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author destinyliu
 */
@RestController
@RequestMapping("commodities")
public class CommodityController {

    @Resource
    private CommodityService commodityService;

    @Autowired
    private TestProperties testProperties;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("recommended")
    public List<Commodity> getRecommendedCommodities() {
        return commodityService.getRecommendedCommodities();
    }

    @RequestMapping("")
    public List<Commodity> getCommodities() {
        return commodityService.getRecommendedCommodities();
    }

    @RequestMapping("test")
    public Object test() {
        return ImmutableMap.of("myName", testProperties.getMyName());
    }

    @RequestMapping("test0")
    public Object test0(HttpServletRequest request) {
        return "get test:" + restTemplate.getForObject(
            "http://127.0.0.1:" + request.getServerPort() + "/commodities/test", String.class);
    }

}
