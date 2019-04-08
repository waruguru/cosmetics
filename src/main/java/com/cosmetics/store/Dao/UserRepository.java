package com.cosmetics.store.Dao;

import com.cosmetics.store.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
