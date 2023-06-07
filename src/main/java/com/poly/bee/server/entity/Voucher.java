package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.PromotionStatus;
import com.poly.bee.server.infrastructure.constant.VoucherStatus;
import com.poly.bee.server.infrastructure.constant.VoucherType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "voucher")
public class Voucher extends PrimaryEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private VoucherStatus status;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "end_time")
    private Long endTime;

    @Column(name = "minimum_amount")
    private BigDecimal minimum_amount;

    @Column(name = "reduced_value")
    private BigDecimal reducedValue;

    @Column(name = "value")
    private Double value;

    @Column(name = "type")
    private VoucherType type;

}
