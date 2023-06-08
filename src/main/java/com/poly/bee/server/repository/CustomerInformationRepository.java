package com.poly.bee.server.repository;

import com.poly.bee.server.entity.CustomerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CustomerInformationRepository.NAME)
public interface CustomerInformationRepository extends JpaRepository<CustomerInformation, String> {
    public static final String NAME = "BaseCustomerInformationRepository";
}
