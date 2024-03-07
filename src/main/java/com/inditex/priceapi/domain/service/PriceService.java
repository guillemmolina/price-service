package com.inditex.priceapi.domain.service;

import com.inditex.priceapi.domain.ports.PricePortInput;
import com.inditex.priceapi.infraestructure.adapters.input.api.mapper.PriceMapper;
import com.inditex.priceapi.domain.db.entity.PriceEntity;
import com.inditex.priceapi.domain.model.Price;
import com.inditex.priceapi.infraestructure.adapters.output.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceService implements PricePortInput {

    PriceRepository repository;
    PriceMapper priceMapper;

    @Override
    public Optional<Price> getAllPrices(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        PriceEntity result = repository.findPrice(brandId, productId, applicationDate);

        if(result != null){
            return Optional.of(priceMapper.priceToModel(result));
        }
        return Optional.empty();
    }
}
