package com.inditex.priceapi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "price")
@Entity
public class Price {

    @Column(name = "brand_id")
    private Integer brand_id;

    @Column(name = "start_date")
    private String start_date;

    @Column(name = "end_date")
    private String end_date;

    @Id
    @Column(name = "price_list")
    private String price_list;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "priority")
    private String priority;

    @Column(name = "price")
    private String price;

    @Column(name = "curr")
    private String curr;

}
