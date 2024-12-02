package com.learn.base_app_code.feature.repository;

import com.learn.base_app_code.feature.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> findIfUserExist();
}
