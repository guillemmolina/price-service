package com.inditex.priceapi.infraestructure.adapters.input.api.controller;

import com.inditex.priceapi.domain.model.Price;
import com.inditex.priceapi.domain.ports.PricePortOutput;
import com.inditex.priceapi.infraestructure.adapters.input.api.dto.PriceDto;
import com.inditex.priceapi.infraestructure.adapters.input.api.mapper.PriceMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PriceController {

    PricePortOutput priceService;
    PriceMapper mapper;

    @GetMapping("/price")
    public ResponseEntity<PriceDto> getAllPrices(
            @RequestParam(name = "application_date") LocalDateTime applicationDate,
            @RequestParam(name = "product_id") Integer productId,
            @RequestParam(name = "brand_id") Integer brandId
    ){
        Optional<Price> price = priceService.getAllPrices(applicationDate, productId, brandId);
        return price.map(value -> new ResponseEntity<>(mapper.priceToDto(value), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }
}
