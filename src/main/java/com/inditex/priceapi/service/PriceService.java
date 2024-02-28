package com.inditex.priceapi.service;

import com.inditex.priceapi.model.entity.Price;
import com.inditex.priceapi.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceService {

    PriceRepository repository;

    public List<Price> getAllPrices(){
        return repository.findAll();
    }
}
