package com.poly.bee.server.infrastructure.listener;

import com.poly.bee.server.entity.base.AuditEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Value;

import java.util.Calendar;

public class AuditEntityListener {

    @Value("${app.UserId}")
    private String id;


    @PrePersist
    private void onCreate(AuditEntity entity) {
        entity.setCreatedAt(getCurrentTime());
        entity.setUpdatedAt(getCurrentTime());
        entity.setDeleted(0);
        entity.setCreatedBy(id);
        entity.setUpdatedBy(id);
    }

    @PreUpdate
    private void onUpdate(AuditEntity entity) {
        entity.setUpdatedAt(getCurrentTime());
    }

    private long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
