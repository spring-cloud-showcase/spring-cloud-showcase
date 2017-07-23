package me.destinyshine.scshop.commodity.infra.repository;

import me.destinyshine.scshop.commodity.domain.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author destinyliu
 */
public interface CommodityRepository extends JpaRepository<Commodity, Long> {

}
