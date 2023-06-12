package com.poly.bee.server.core.admin.repository;


import com.poly.bee.server.core.admin.model.request.AdminShoesCollarRequest;
import com.poly.bee.server.core.admin.model.response.AdminShoesCollarRespone;
import com.poly.bee.server.repository.ShoesCollarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminShoesCollarRepository extends ShoesCollarRepository {

    @Query(value = """
            SELECT ROW_NUMBER() OVER(ORDER BY ca.created_at DESC) AS stt, ca.id, ca.code, ca.name
            FROM shoes_collar ca
            WHERE (:#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.code LIKE %:#{#request.search}% 
            ) OR (
                    :#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.name LIKE :#{#request.search} 
            )
            """, countQuery = """

            """, nativeQuery = true)
    Page<AdminShoesCollarRespone> getAllShoesCollar(Pageable pageable, @Param("request") AdminShoesCollarRequest request);
}
