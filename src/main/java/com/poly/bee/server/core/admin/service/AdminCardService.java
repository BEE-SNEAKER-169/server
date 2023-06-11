package com.poly.bee.server.core.admin.service;

import com.poly.bee.server.core.admin.model.request.AdminCreateCardRequest;
import com.poly.bee.server.entity.Card;

public interface AdminCardService {
    Card addCard(AdminCreateCardRequest request);

}
