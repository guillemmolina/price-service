package com.inditex.priceapi.service;

import com.inditex.priceapi.infraestructure.mapper.PriceMapper;
import com.inditex.priceapi.model.entity.PriceEntity;
import com.inditex.priceapi.model.model.Price;
import com.inditex.priceapi.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class PriceService {

    PriceRepository repository;
    PriceMapper priceMapper;

    public Price getAllPrices(LocalDateTime applicationDate, Integer productId, Integer brandId){
        List<PriceEntity> result = repository.findByBrandIdAndProductId(brandId, productId);

        List<PriceEntity> filtered = result.stream()
                .filter(price -> price.getStartDate().isBefore(applicationDate) && price.getEndDate().isAfter(applicationDate)).toList();

        PriceEntity resultList =  filtered.stream()
                 .max(Comparator.comparingInt(PriceEntity::getPriority))
                 .orElseThrow(() -> new IllegalArgumentException("No se encontró ningún elemento"));
        return priceMapper.priceToDTO(resultList);
    }
}
