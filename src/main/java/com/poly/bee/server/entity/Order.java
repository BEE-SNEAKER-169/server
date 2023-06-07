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

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "order")
public class Order extends PrimaryEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "confirmation_date") // ngày xác nhận
    private Long confirmationDate;

    @Column(name = "delivery_date") // ngày giao hàng
    private Long deliveryDate;

    @Column(name = "received_date")  // ngày nhận hàng
    private Long receivedDate;

    @Column(name = "completion_date") // ngày hoàn thành
    private Long completionDate;

    @Column(name = "desired_date")  // ngày mong muốn nhận hàng
    private Long desiredDate;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "money_ship")  // tiền ship
    private BigDecimal moneyShip;

    @Column(name = "total_money") // tổng tiền
    private BigDecimal totalMoney;

    @Column(name = "reduction_amount")  // số lượng giảm
    private BigDecimal reductionAmount;

    @Column(name = "deposit")  // tiền cọc
    private BigDecimal deposit;

    @Column(name = "status")
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerInformation customerInformation;

}
