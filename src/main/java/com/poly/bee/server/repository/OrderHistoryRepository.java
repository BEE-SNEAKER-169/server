package com.poly.bee.server.repository;

import com.poly.bee.server.entity.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderHistoryRepository.NAME)
public interface OrderHistoryRepository extends JpaRepository<BillHistory, String> {
    public static final String NAME = "BaseOrderHistoryRepository";
}
