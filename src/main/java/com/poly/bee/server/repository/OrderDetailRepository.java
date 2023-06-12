package com.poly.bee.server.repository;

import com.poly.bee.server.entity.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrderDetailRepository.NAME)
public interface OrderDetailRepository extends JpaRepository<BillDetail, String> {
    public static final String NAME = "BaseOrderDetailRepository";
}
