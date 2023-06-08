package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(RoleRepository.NAME)
public interface RoleRepository extends JpaRepository<Role, String> {
    public static final String NAME = "BaseRoleRepository";
}
