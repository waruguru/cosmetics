package com.cosmetics.store.service;

import com.cosmetics.store.models.Products;
import com.cosmetics.store.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Products save(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }
    @Override
    public void delete(Long id) {
    productsRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        productsRepository.deleteAll();
    }

    @Override
    public long count() {
        return productsRepository.count();
    }

}