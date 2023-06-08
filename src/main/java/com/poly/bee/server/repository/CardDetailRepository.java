package com.poly.bee.server.repository;

import com.poly.bee.server.entity.CardDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CardDetailRepository.NAME)
public interface CardDetailRepository extends JpaRepository<CardDetail, String> {
    public static final String NAME = "BaseCardDetailRepository";
}
