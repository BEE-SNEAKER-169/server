package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderRepository.NAME)
public interface OrderRepository extends JpaRepository<Bill, String> {
    public static final String NAME = "BaseOrderRepository";
}
