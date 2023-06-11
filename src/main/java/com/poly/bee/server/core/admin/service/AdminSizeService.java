package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSizeRequest;
import com.poly.bee.server.core.admin.model.response.AdminSizeRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Size;

public interface AdminSizeService {
    PageableObject<AdminSizeRespone> getAllSize(final AdminSizeRequest request);

    Size addSize(AdminCreateSizeRequest request);

    Size updateSize(AdminUpdateSizeRequest request, String id);

    void deleteSize(String id);

    Size getOne(String id);
}
