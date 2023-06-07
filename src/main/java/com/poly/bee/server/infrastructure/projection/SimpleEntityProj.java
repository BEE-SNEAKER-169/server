package com.poly.bee.server.infrastructure.projection;

import com.poly.bee.server.entity.base.IsIdentified;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {})
public interface SimpleEntityProj extends IsIdentified {
    String getName();
}
