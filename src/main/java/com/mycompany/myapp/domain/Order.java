package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "status")
    private String status;

    @Column(name = "order_placed_date_and_time")
    private ZonedDateTime orderPlacedDateAndTime;

    @Column(name = "order_completed_date_and_time")
    private ZonedDateTime orderCompletedDateAndTime;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order id(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Order productId(Long productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Order userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }

    public Order status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ZonedDateTime getOrderPlacedDateAndTime() {
        return this.orderPlacedDateAndTime;
    }

    public Order orderPlacedDateAndTime(ZonedDateTime orderPlacedDateAndTime) {
        this.orderPlacedDateAndTime = orderPlacedDateAndTime;
        return this;
    }

    public void setOrderPlacedDateAndTime(ZonedDateTime orderPlacedDateAndTime) {
        this.orderPlacedDateAndTime = orderPlacedDateAndTime;
    }

    public ZonedDateTime getOrderCompletedDateAndTime() {
        return this.orderCompletedDateAndTime;
    }

    public Order orderCompletedDateAndTime(ZonedDateTime orderCompletedDateAndTime) {
        this.orderCompletedDateAndTime = orderCompletedDateAndTime;
        return this;
    }

    public void setOrderCompletedDateAndTime(ZonedDateTime orderCompletedDateAndTime) {
        this.orderCompletedDateAndTime = orderCompletedDateAndTime;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", productId=" + getProductId() +
            ", userId=" + getUserId() +
            ", status='" + getStatus() + "'" +
            ", orderPlacedDateAndTime='" + getOrderPlacedDateAndTime() + "'" +
            ", orderCompletedDateAndTime='" + getOrderCompletedDateAndTime() + "'" +
            "}";
    }
}
