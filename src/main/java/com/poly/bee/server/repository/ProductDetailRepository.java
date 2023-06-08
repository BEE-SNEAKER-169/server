package com.poly.bee.server.repository;

import com.poly.bee.server.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ProductDetailRepository.NAME)
public interface ProductDetailRepository extends JpaRepository<ProductDetail, String> {
    public static final String NAME = "BaseProductDetailRepository";
}
