package com.cosmetics.store.repository;

import com.cosmetics.store.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}