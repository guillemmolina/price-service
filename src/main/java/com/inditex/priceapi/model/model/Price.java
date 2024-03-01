package com.inditex.priceapi.model.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Price {

    private Integer brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String priceList;
    private String productId;
    private Integer priority;
    private String price;
    private String curr;
}
