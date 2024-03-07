package com.inditex.priceapi.infraestructure.adapters.input.api.mapper;

import com.inditex.priceapi.domain.db.entity.PriceEntity;
import com.inditex.priceapi.domain.model.Price;
import com.inditex.priceapi.infraestructure.adapters.input.api.dto.PriceDto;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring")
public interface PriceMapper {
    Price priceToModel(PriceEntity priceEntity);

    PriceDto priceToDto(Price price);
}
