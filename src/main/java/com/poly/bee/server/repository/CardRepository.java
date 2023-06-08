package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CardRepository.NAME)
public interface CardRepository extends JpaRepository<Card, String> {
    public static final String NAME = "BaseCardRepository";
}
