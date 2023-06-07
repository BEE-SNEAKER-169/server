package com.poly.bee.server.entity;

import com.poly.bee.server.entity.base.PrimaryEntity;
import com.poly.bee.server.infrastructure.constant.ImageStatus;
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
@Table(name = "image")
public class Image extends PrimaryEntity {

    @Column(name = "name")
    private String url;

    @Column(name = "status")
    private ImageStatus status;

    @Column(name = "cover")
    private Integer cover;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductDetail productDetail;

}
