package com.cosmetics.store.repository;

import com.cosmetics.store.models.ProductTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypesRepository extends JpaRepository<ProductTypes, Long> {
}