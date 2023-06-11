package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateColorRequest;
import com.poly.bee.server.core.admin.model.response.AdminColorRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Color;

public interface AdminColorService {
    PageableObject<AdminColorRespone> getAllColor(final AdminColorRequest request);

    Color addColor(AdminCreateColorRequest request);

    Color updateColor(AdminUpdateColorRequest request, String id);

    void deleteColor(String id);

    Color getOne(String id);
}
