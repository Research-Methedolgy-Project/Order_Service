package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Order} entity.
 */
public class OrderDTO implements Serializable {

    private Long id;

    private Long productId;

    private Long userId;

    private String status;

    private ZonedDateTime orderPlacedDateAndTime;

    private ZonedDateTime orderCompletedDateAndTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ZonedDateTime getOrderPlacedDateAndTime() {
        return orderPlacedDateAndTime;
    }

    public void setOrderPlacedDateAndTime(ZonedDateTime orderPlacedDateAndTime) {
        this.orderPlacedDateAndTime = orderPlacedDateAndTime;
    }

    public ZonedDateTime getOrderCompletedDateAndTime() {
        return orderCompletedDateAndTime;
    }

    public void setOrderCompletedDateAndTime(ZonedDateTime orderCompletedDateAndTime) {
        this.orderCompletedDateAndTime = orderCompletedDateAndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrderDTO)) {
            return false;
        }

        OrderDTO orderDTO = (OrderDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, orderDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OrderDTO{" +
            "id=" + getId() +
            ", productId=" + getProductId() +
            ", userId=" + getUserId() +
            ", status='" + getStatus() + "'" +
            ", orderPlacedDateAndTime='" + getOrderPlacedDateAndTime() + "'" +
            ", orderCompletedDateAndTime='" + getOrderCompletedDateAndTime() + "'" +
            "}";
    }
}
