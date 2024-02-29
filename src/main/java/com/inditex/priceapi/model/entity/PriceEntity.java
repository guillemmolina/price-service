package com.inditex.priceapi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "price")
@Entity
public class PriceEntity {

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Id
    @Column(name = "price_list")
    private String priceList;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "priority")
    private String priority;

    @Column(name = "price")
    private String price;

    @Column(name = "curr")
    private String curr;

}
