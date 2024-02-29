package com.inditex.priceapi.mapper;


import com.inditex.priceapi.model.dto.PriceDto;
import com.inditex.priceapi.model.entity.PriceEntity;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring")
public interface PriceMapper {
    PriceDto priceToDTO(PriceEntity priceEntity);
}
