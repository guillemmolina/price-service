package com.inditex.priceapi.service;

import com.inditex.priceapi.mapper.PriceMapper;
import com.inditex.priceapi.model.dto.PriceDto;
import com.inditex.priceapi.model.entity.PriceEntity;
import com.inditex.priceapi.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceService {

    PriceRepository repository;
    PriceMapper priceMapper;

    public List<PriceDto> getAllPrices(){
        List<PriceEntity> result = repository.findAll();
        return result.stream().map(priceMapper::priceToDTO).toList();
    }
}
