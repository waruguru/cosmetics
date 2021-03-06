package com.cosmetics.store.models;

import javax.persistence.*;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private  Long id;
    @Column(name = "store_name")
    private  String storeName;
    @Column(name = "location")
    private Long location;
    @Column
    private  String address;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_name")
    private Products productName;

    public Store(String storeName, Long location, String address, Products productName) {
        this.storeName = storeName;
        this.location = location;
        this.address = address;
        this.productName = productName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Products getProductName() {
        return productName;
    }

    public void setProductName(Products productName) {
        this.productName = productName;
    }
}
