package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ImageRepository.NAME)
public interface ImageRepository extends JpaRepository<Image, String> {
    public static final String NAME = "BaseImageRepository";
}
