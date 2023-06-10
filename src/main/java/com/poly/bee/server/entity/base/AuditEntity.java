package com.poly.bee.server.entity.base;

import com.poly.bee.server.infrastructure.constant.EntityProperties;
import com.poly.bee.server.infrastructure.listener.AuditEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditEntity {

    @Column(name="created_at", updatable = false)
    private Long createdAt;

    @Column(name="updated_at")
    private Long updatedAt;

    @Column(name="created_by", length = EntityProperties.LENGTH_ID)
    private String createdBy;

    @Column(name="updated_by", length = EntityProperties.LENGTH_ID)
    private String updatedBy;

    @Column(name="deleted")
    private Integer deleted;

}
