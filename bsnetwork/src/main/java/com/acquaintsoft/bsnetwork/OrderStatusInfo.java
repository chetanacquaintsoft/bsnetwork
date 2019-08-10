package com.acquaintsoft.bsnetwork;

import com.acquaintsoft.bsnetwork.matcher.Order;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatusInfo {
    private long filled;
    private Order.Status status;

    @JsonCreator
    private OrderStatusInfo(
            @JsonProperty("filled") long filled,
            @JsonProperty("status") Order.Status status) {

        this.status = status;
        this.filled = filled;
    }

    public long getFilled() {
        return filled;
    }

    public Order.Status getStatus() {
        return status;
    }
}
