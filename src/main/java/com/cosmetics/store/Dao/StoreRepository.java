package com.cosmetics.store.Dao;

import com.cosmetics.store.Model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StoreRepository extends JpaRepository<Store,Long> {
}
