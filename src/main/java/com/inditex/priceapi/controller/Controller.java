package com.inditex.priceapi.controller;


import com.inditex.priceapi.model.entity.Price;
import com.inditex.priceapi.service.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {

    PriceService priceService;

    @GetMapping("/price")
    private List<Price> getAllPrices(){
        return priceService.getAllPrices();
    }
}
