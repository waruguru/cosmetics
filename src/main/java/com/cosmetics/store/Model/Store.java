package com.cosmetics.store.Model;

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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_name")
    private Products productName;

    public Store(Long id, String storeName, Long location, String address, Products productName) {
        this.id = id;
        this.storeName = storeName;
        this.location = location;
        this.address = address;
        this.productName = productName;
    }

    public Store() {
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

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", location=" + location +
                ", address='" + address + '\'' +
                ", productName=" + productName +
                '}';
    }
}
