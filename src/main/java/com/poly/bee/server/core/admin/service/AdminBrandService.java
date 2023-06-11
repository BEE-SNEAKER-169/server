package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateBrandRequest;
import com.poly.bee.server.core.admin.model.response.AdminBrandRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Brand;

public interface AdminBrandService {
    PageableObject<AdminBrandRespone> getAllBrand(final AdminBrandRequest request);

    Brand addBrand(AdminCreateBrandRequest request);

    Brand updateBrand(AdminUpdateBrandRequest request, String id);

    void deleteBrand(String id);

    Brand getOne(String id);
}
