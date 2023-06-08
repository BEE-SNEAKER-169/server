package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ProductRepository.NAME)
public interface ProductRepository extends JpaRepository<Product, String> {
    public static final String NAME = "BaseProductRepository";
}
