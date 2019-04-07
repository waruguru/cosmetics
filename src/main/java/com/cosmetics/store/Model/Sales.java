package com.cosmetics.store.Model;

import javax.persistence.*;

@Entity
@Table(name="sales")
public class Sales {

    @Id
    @GeneratedValue
    @Column(name = "sales_id")
    private Long id;
    @Column(name ="selling_price" )
    private Double sellingPrice ;
    @Column(name = "discount")
    private Double Discount ;
    @Column(name = "quantity")
    private Integer quantity ;

    private Sales(Long id, Double sellingPrice, Double discount, Integer quantity) {
        this.id = id;
        this.sellingPrice = sellingPrice;
        Discount = discount;
        this.quantity = quantity;
    }

    public Sales() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", sellingPrice=" + sellingPrice +
                ", Discount=" + Discount +
                ", quantity=" + quantity +
                '}';
    }
}
