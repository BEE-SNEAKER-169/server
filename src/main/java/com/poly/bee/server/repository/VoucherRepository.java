package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(VoucherRepository.NAME)
public interface VoucherRepository extends JpaRepository<Voucher, String> {
    public static final String NAME = "BaseVoucherRepository";
}
