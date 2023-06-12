package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.TransactionType;
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
@Table(name = "transaction")
public class Transaction extends PrimaryEntity {

    @Column(name = "total_money")
    private BigDecimal totalMoney;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @Column(name = "type")
    private TransactionType type;

}
