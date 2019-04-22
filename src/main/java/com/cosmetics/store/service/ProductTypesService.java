package com.cosmetics.store.service;

import com.cosmetics.store.models.ProductTypes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProductTypesService {

    ProductTypes save(ProductTypes producttypes);
    List<ProductTypes> findAll();
    void delete(Long id);
    void deleteAll();
    long count();
}