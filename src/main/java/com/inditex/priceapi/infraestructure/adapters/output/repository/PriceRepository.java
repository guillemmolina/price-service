package com.inditex.priceapi.infraestructure.adapters.output.repository;

import com.inditex.priceapi.domain.db.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    @Query("SELECT p FROM PriceEntity p " +
            "WHERE p.brandId = :brand_id " +
            "AND p.productId = :product_id " +
            "AND :application_date BETWEEN p.startDate AND p.endDate " +
            "AND p.priority = (SELECT MAX(p2.priority) FROM PriceEntity p2 " +
            "WHERE p2.brandId = :brand_id " +
            "AND p2.productId = :product_id " +
            "AND :application_date BETWEEN p2.startDate AND p2.endDate)")
    PriceEntity findPrice(
            @Param("brand_id") Integer brandId,
            @Param("product_id") Integer productId,
            @Param("application_date") LocalDateTime applicationDate);
}
