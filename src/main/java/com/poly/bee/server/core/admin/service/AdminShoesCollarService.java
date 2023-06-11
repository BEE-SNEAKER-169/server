package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminShoesCollarRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateShoesCollarRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateShoesCollarRequest;
import com.poly.bee.server.core.admin.model.response.AdminShoesCollarRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.ShoesCollar;

public interface AdminShoesCollarService {
    PageableObject<AdminShoesCollarRespone> getAllShoesCollar(final AdminShoesCollarRequest request);

    ShoesCollar addShoesCollar(AdminCreateShoesCollarRequest request);

    ShoesCollar updateShoesCollar(AdminUpdateShoesCollarRequest request, String id);

    void deleteShoesCollar(String id);

    ShoesCollar getOne(String id);
}
