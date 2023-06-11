package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateProductRequest;
import com.poly.bee.server.core.admin.model.response.AdminProductRespone;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Product;

public interface AdminProductService {
    PageableObject<AdminProductRespone> getAllProduct(final AdminProductRequest request);

    Product addProduct(AdminCreateProductRequest request);

    Product updateProduct(AdminUpdateProductRequest request, String id);

    void deleteProduct(String id);

    Product getOne(String id);
}
