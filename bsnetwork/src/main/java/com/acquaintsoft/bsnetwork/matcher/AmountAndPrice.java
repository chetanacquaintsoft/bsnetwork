package com.acquaintsoft.bsnetwork.matcher;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AmountAndPrice {
    private final long amount;
    private final long price;

    @JsonCreator
    public AmountAndPrice(
            @JsonProperty("amount") long amount,
            @JsonProperty("price") long price
    ) {
        this.amount = amount;
        this.price = price;
    }
    public long getAmount() {
        return amount;
    }

    public long getPrice() {
        return price;
    }
}
