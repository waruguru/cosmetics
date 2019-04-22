package com.cosmetics.store.service;

import com.cosmetics.store.models.ProductTypes;
import com.cosmetics.store.repository.ProductTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class ProductTypesServiceImpl implements ProductTypesService {

    @Autowired
    private ProductTypesRepository producttypesRepository;

    @Override
    public ProductTypes save(ProductTypes producttypes) {
        return producttypesRepository.save(producttypes);
    }

    @Override
    public List<ProductTypes> findAll() {
        return producttypesRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        producttypesRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        producttypesRepository.deleteAll();
    }

    @Override
    public long count() {
        return producttypesRepository.count();
    }

}