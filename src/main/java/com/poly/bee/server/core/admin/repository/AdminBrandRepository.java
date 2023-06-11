package com.poly.bee.server.core.admin.repository;


import com.poly.bee.server.core.admin.model.request.AdminBrandRequest;
import com.poly.bee.server.core.admin.model.response.AdminBrandRespone;
import com.poly.bee.server.repository.BrandRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminBrandRepository extends BrandRepository {

    @Query(value = """
            SELECT ROW_NUMBER() OVER(ORDER BY ca.created_at DESC) AS stt, ca.id, ca.code, ca.name
            FROM brand ca
            WHERE (:#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.code LIKE :#{#request.search} 
            ) OR (
                    :#{#request.search} IS NULL 
                    OR :#{#request.search} LIKE ''
                    OR ca.name LIKE :#{#request.search} 
            )
            """, countQuery = """

            """, nativeQuery = true)
    Page<AdminBrandRespone> getAllBrand(Pageable pageable, @Param("request") AdminBrandRequest request);
}
