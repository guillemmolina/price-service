package com.inditex.priceapi.application;

import com.inditex.priceapi.domain.model.Price;
import com.inditex.priceapi.domain.ports.PricePortInput;
import com.inditex.priceapi.domain.ports.PricePortOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UseCasePrice implements PricePortOutput {

    PricePortInput pricePortInput;

    @Override
    public Optional<Price> getAllPrices(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        return pricePortInput.getAllPrices(applicationDate, productId, brandId);
    }
}
