package com.inditex.priceapi.infraestructure.mapper;

import com.inditex.priceapi.model.entity.PriceEntity;
import com.inditex.priceapi.model.model.Price;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring")
public interface PriceMapper {
    Price priceToDTO(PriceEntity priceEntity);
}
