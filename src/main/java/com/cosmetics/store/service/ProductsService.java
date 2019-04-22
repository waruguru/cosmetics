package com.cosmetics.store.service;

import com.cosmetics.store.models.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ProductsService {

    Products save(Products products);

    List<Products> findAll();

    void delete(Long id);

    void deleteAll();

    long count();

}