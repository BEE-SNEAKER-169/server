package com.poly.bee.server.core.admin.model.response;

import com.poly.bee.server.entity.Category;
import com.poly.bee.server.entity.base.IsIdentified;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Category.class})
public interface AdminCategoryRespone extends IsIdentified {

    Integer getStt();

    @Value("#{target.id}")
    String getId();

    @Value("#{target.code}")
    String getCode();

    @Value("#{target.name}")
    String getName();
}
