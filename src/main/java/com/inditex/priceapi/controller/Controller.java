package com.inditex.priceapi.controller;


import com.inditex.priceapi.mapper.PriceMapper;
import com.inditex.priceapi.model.dto.PriceDto;
import com.inditex.priceapi.model.entity.PriceEntity;
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
    private List<PriceDto> getAllPrices(){
        return priceService.getAllPrices();
    }
}
