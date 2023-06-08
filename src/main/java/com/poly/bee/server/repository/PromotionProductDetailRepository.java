package com.poly.bee.server.repository;

import com.poly.bee.server.entity.PromotionProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(PromotionProductDetailRepository.NAME)
public interface PromotionProductDetailRepository extends JpaRepository<PromotionProductDetail, String> {
    public static final String NAME = "BasePromotionProductDetailRepository";
}
