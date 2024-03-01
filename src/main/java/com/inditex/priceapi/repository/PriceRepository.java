package com.inditex.priceapi.repository;

import com.inditex.priceapi.model.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    List<PriceEntity> findByBrandIdAndProductId(@Param("brand_id") Integer brandId, @Param("product_id") Integer productId);
}
