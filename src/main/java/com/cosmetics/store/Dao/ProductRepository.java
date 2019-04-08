package com.cosmetics.store.Dao;

import com.cosmetics.store.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
}