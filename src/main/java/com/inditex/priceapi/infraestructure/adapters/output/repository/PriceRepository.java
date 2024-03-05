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
            "ORDER BY p.priority DESC " +
            "LIMIT 1 ")
    PriceEntity findPrice(
            @Param("brand_id") Integer brandId,
            @Param("product_id") Integer productId,
            @Param("application_date") LocalDateTime applicationDate);
}
