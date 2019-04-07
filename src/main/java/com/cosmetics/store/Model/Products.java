package com.cosmetics.store.Model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Products {
    @Id
    @GeneratedValue
    @Column(name="product_id")
    private  Long id;
    @Column(name="product_name")
    private  String productName;
    @Column(name="product_type")
    private  String productType;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_name")
    private  Store store;

    public Products(Long id, String productName, String productType, Store store) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.store = store;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", store=" + store +
                '}';
    }
}
