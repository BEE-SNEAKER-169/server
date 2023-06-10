package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
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
@Table(name = "promotion_product_detail")
public class PromotionProductDetail extends PrimaryEntity {

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "price_after_promotion")
    private BigDecimal priceAfterPromotion;

    @ManyToOne
    @JoinColumn(name = "detail_product_id")
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;

}
