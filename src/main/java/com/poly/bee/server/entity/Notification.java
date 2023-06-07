package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.NotificationStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "notification")
public class Notification extends PrimaryEntity {

    @Column(name = "content")
    private String content;

    @Column(name = "url")
    private String url;

    @Column(name = "status")
    private NotificationStatus status;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
