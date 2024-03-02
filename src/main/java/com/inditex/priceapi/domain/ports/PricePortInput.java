package com.inditex.priceapi.domain.ports;

import com.inditex.priceapi.domain.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PricePortInput {
    Optional<Price> getAllPrices(LocalDateTime applicationDate, Integer productId, Integer brandId);
}
