package com.cosmetics.store.models;

import javax.persistence.*;

@Entity
@Table(name = "product_type")
public class ProductTypes {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_name")
    private Products productName;
    @Column
    private  String productTypeDescription;

    public ProductTypes(Long id, Products productName, String productTypeDescription) {
        this.id = id;
        this.productName = productName;
        this.productTypeDescription = productTypeDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products getProductName() {
        return productName;
    }

    public void setProductName(Products productName) {
        this.productName = productName;
    }

    public String getProductTypeDescription() {
        return productTypeDescription;
    }

    public void setProductTypeDescription(String productTypeDescription) {
        this.productTypeDescription = productTypeDescription;
    }
}
