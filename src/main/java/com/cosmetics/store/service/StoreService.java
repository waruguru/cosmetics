package com.cosmetics.store.service;

import com.cosmetics.store.models.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    Store save(Store store);


    List<Store> findAll();

    void delete(Long id);

    void deleteAll();

    long count();

}