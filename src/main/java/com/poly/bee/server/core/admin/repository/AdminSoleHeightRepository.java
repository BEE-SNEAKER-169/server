package com.poly.bee.server.core.admin.repository;


import com.poly.bee.server.core.admin.model.request.AdminSoleHeightRequest;
import com.poly.bee.server.core.admin.model.response.AdminSoleHeightRespone;
import com.poly.bee.server.repository.SoleHeightRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminSoleHeightRepository extends SoleHeightRepository {

    @Query(value = """
            SELECT ROW_NUMBER() OVER(ORDER BY ca.created_at DESC) AS stt, ca.id, ca.code, ca.name
            FROM sole_height ca
            WHERE (:#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.code LIKE %:#{#request.search}% 
            ) OR (
                    :#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.name LIKE %:#{#request.search}% 
            )
            """, countQuery = """

            """, nativeQuery = true)
    Page<AdminSoleHeightRespone> getAllSoleHeight(Pageable pageable, @Param("request") AdminSoleHeightRequest request);
}
