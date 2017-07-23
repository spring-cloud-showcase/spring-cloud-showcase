package me.destinyshine.scshop.commodity.application;

import java.util.List;

import javax.annotation.Resource;

import me.destinyshine.scshop.commodity.domain.Commodity;
import me.destinyshine.scshop.commodity.infra.repository.CommodityRepository;
import me.destinyshine.scshop.commodity.infra.repository.CommoditySearchOperator;
import org.springframework.stereotype.Service;


/**
 * @author destinyliu
 */
@Service
public class CommodityService {

    @Resource
    private CommodityRepository commodityRepository;

    @Resource
    private CommoditySearchOperator commoditySearchOperator;

    public void create(Commodity commodity) {
        commodityRepository.save(commodity);
    }

    public List<Commodity> getRecommendedCommodities() {
        return commodityRepository.findAll();
    }

    public List<Commodity> getCommodities() {
        return commodityRepository.findAll();
    }
}
