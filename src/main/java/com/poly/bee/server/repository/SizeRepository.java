package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(SizeRepository.NAME)
public interface SizeRepository extends JpaRepository<Size, String> {
    public static final String NAME = "BaseSizeRepository";
}
