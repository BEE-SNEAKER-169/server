package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "bill_history")
public class BillHistory extends PrimaryEntity {

    @Column(name = "action_description")
    private String actionDescription;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @Column(name = "status")
    private OrderStatus status;

}
