package com.cosmetics.store.Dao;

import com.cosmetics.store.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
