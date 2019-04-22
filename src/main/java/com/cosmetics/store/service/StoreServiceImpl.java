package com.cosmetics.store.service;

import com.cosmetics.store.models.Store;
import com.cosmetics.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public Store save(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public void delete(Long id) {
    storeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        storeRepository.deleteAll();
    }

    @Override
    public long count() {
        return storeRepository.count();
    }

}