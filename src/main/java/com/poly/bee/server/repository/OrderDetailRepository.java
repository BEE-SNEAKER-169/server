package com.poly.bee.server.repository;

import com.poly.bee.server.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderDetailRepository.NAME)
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    public static final String NAME = "BaseOrderDetailRepository";
}
