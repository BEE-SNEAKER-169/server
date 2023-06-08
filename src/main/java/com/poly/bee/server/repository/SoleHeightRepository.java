package com.poly.bee.server.repository;

import com.poly.bee.server.entity.SoleHeight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(SoleHeightRepository.NAME)
public interface SoleHeightRepository extends JpaRepository<SoleHeight, String> {
    public static final String NAME = "BaseSoleHeightRepository";
}
