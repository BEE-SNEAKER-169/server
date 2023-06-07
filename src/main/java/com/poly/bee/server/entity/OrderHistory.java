package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.OrderDetailStatus;
import com.poly.bee.server.infrastructure.constant.OrderStatus;
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

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "order_history")
public class OrderHistory extends PrimaryEntity {

    @Column(name = "action_description")
    private String actionDescription;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "status")
    private OrderStatus status;

}
