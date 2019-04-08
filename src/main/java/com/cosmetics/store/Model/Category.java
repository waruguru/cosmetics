package com.cosmetics.store.Model;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_type")
    private Products productType;

    private Category(Long id, Products productType) {
        this.id = id;
        this.productType = productType;
    }

    private Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products getProductType() {
        return productType;
    }

    public void setProductType(Products productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", productType=" + productType +
                '}';
    }
}
