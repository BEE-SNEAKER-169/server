package com.poly.bee.server.repository;

import com.poly.bee.server.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderHistoryRepository.NAME)
public interface OrderHistoryRepository extends JpaRepository<OrderHistory, String> {
    public static final String NAME = "BaseOrderHistoryRepository";
}
