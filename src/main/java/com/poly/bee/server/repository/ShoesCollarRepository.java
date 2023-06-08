package com.poly.bee.server.repository;

import com.poly.bee.server.entity.ShoesCollar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ShoesCollarRepository.NAME)
public interface ShoesCollarRepository extends JpaRepository<ShoesCollar, String> {
    public static final String NAME = "BaseShoesCollarRepository";
}
