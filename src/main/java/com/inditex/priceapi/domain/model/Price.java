package com.inditex.priceapi.domain.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Price {

    private Integer brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priceList;
    private Integer productId;
    private Integer priority;
    private String productPrice;
    private String curr;
}
