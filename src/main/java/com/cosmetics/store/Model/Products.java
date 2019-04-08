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

    public Products(Long id, String productName, String productType) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
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


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }
}
