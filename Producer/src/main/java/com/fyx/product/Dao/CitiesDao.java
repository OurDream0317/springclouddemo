package com.fyx.product.Dao;

import com.fyx.product.pojo.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CitiesDao extends JpaRepository<Cities,Integer> {
    @Override
    Optional<Cities> findById(Integer integer);
}
