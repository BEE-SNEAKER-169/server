package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.OrderDetailStatus;
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
@Table(name = "bill_detail")
public class BillDetail extends PrimaryEntity {

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;

    @ManyToOne
    @JoinColumn(name = "detail_product_id")
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @Column(name = "status")
    private OrderDetailStatus status;

}
