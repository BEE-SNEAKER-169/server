package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateCategoryRequest;
import com.poly.bee.server.core.admin.model.response.AdminCategoryRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Category;

import java.util.List;

public interface AdminCategoryService {
    PageableObject<AdminCategoryRespone> getAllCategory(final AdminCategoryRequest request);

    Category addCategory(AdminCreateCategoryRequest request);

    Category updateCategory(AdminUpdateCategoryRequest request, String id);

    void deleteCategory(String id);

    Category getOne(String id);
}
