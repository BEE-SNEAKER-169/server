package com.poly.bee.server.core.admin.model.response;

import com.poly.bee.server.entity.Product;
import com.poly.bee.server.entity.base.IsIdentified;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Product.class})
public interface AdminProductRespone extends IsIdentified {

    Integer getStt();

    @Value("#{target.id}")
    String getId();

    @Value("#{target.code}")
    String getCode();

    @Value("#{target.name}")
    String getName();
}
