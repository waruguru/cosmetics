package com.cosmetics.store.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Products extends CrudRepository<Products, Long> {
}
