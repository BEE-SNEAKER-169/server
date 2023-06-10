package com.poly.bee.server.core.admin.repository;


import com.poly.bee.server.core.admin.model.response.AdminCategoryRespone;
import com.poly.bee.server.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface AdminCategoryRepository extends CategoryRepository {

    @Query(value = """
            SELECT ROW_NUMBER() OVER(ORDER BY ca.created_at DESC) AS stt, ca.id, ca.code, ca.name
            FROM category ca
            """, countQuery = """

            """, nativeQuery = true)
    Page<AdminCategoryRespone> getAllCategory(Pageable pageable);

}
