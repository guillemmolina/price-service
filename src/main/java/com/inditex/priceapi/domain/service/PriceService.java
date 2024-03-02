package com.inditex.priceapi.domain.service;

import com.inditex.priceapi.domain.ports.PricePortInput;
import com.inditex.priceapi.infraestructure.adapters.input.api.mapper.PriceMapper;
import com.inditex.priceapi.domain.db.entity.PriceEntity;
import com.inditex.priceapi.domain.model.Price;
import com.inditex.priceapi.domain.db.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceService implements PricePortInput {

    PriceRepository repository;
    PriceMapper priceMapper;

    @Override
    public Optional<Price> getAllPrices(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        List<PriceEntity> result = repository.findByBrandIdAndProductId(brandId, productId);

        List<PriceEntity> filtered = result.stream()
                .filter(price -> price.getStartDate().isBefore(applicationDate) && price.getEndDate().isAfter(applicationDate)).toList();

        Optional<PriceEntity> optionalResult = filtered.stream()
                .max(Comparator.comparingInt(PriceEntity::getPriority));

        return optionalResult.map(priceMapper::priceToMODEL);
    }
}
