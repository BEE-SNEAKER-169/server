package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderRepository.NAME)
public interface OrderRepository extends JpaRepository<Order, String> {
    public static final String NAME = "BaseOrderRepository";
}
