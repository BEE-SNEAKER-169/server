package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminCreateMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateMaterialRequest;
import com.poly.bee.server.core.admin.model.response.AdminMaterialRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Material;

public interface AdminMaterialService {
    PageableObject<AdminMaterialRespone> getAllMaterial(final AdminMaterialRequest request);

    Material addMaterial(AdminCreateMaterialRequest request);

    Material updateMaterial(AdminUpdateMaterialRequest request, String id);

    void deleteMaterial(String id);

    Material getOne(String id);
}
