package com.fyx.product.Dao;

import com.fyx.product.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {
    @Override
    List<Product> findAll();
}
