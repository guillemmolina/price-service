package com.inditex.priceapi.infraestructure.adapters.input.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceDto {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("brand_id")
    private Integer brandId;

    @JsonProperty("price_list")
    private String priceList;

    @JsonProperty("start_date")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    private LocalDateTime endDate;
}
