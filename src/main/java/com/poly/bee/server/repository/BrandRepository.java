package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(BrandRepository.NAME)
public interface BrandRepository extends JpaRepository<Brand, String> {
    public static final String NAME = "BaseBrandRepository";
}
