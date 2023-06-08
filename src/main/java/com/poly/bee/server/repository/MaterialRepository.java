package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(MaterialRepository.NAME)
public interface MaterialRepository extends JpaRepository<Material, String> {
    public static final String NAME = "BaseMaterialRepository";
}
