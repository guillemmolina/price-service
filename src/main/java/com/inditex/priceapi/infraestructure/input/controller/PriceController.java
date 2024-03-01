package com.inditex.priceapi.infraestructure.input.controller;

import com.inditex.priceapi.model.model.Price;
import com.inditex.priceapi.service.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class PriceController {

    PriceService priceService;

    @GetMapping("/price")
    private Price getAllPrices(
            @RequestParam(name = "application_date") LocalDateTime applicationDate,
            @RequestParam(name = "product_id") Integer productId,
            @RequestParam(name = "brand_id") Integer brandId
    ){
        return priceService.getAllPrices(applicationDate, productId, brandId);
    }
}
