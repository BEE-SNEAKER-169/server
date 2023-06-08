package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ColorRepository.NAME)
public interface ColorRepository extends JpaRepository<Color, String> {
    public static final String NAME = "BaseColorRepository";
}
