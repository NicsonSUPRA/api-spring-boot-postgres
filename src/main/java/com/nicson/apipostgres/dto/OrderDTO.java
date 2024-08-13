package com.nicson.apipostgres.dto;

import com.nicson.apipostgres.models.Order;
import com.nicson.apipostgres.models.enums.OrderStatus;

public class OrderDTO {
    private long id;
    private OrderStatus orderStatus;

    public OrderDTO(Order order) {
        this.id = order.getId();
        this.orderStatus = order.getOrderStatus();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
