package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSoleHeightRequest;
import com.poly.bee.server.core.admin.model.response.AdminSoleHeightRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.SoleHeight;

public interface AdminSoleHeightService {
    PageableObject<AdminSoleHeightRespone> getAllSoleHeight(final AdminSoleHeightRequest request);

    SoleHeight addSoleHeight(AdminCreateSoleHeightRequest request);

    SoleHeight updateSoleHeight(AdminUpdateSoleHeightRequest request, String id);

    void deleteSoleHeight(String id);

    SoleHeight getOne(String id);
}
