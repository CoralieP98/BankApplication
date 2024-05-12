package com.Phenix13.mscards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Customer {
    private int customerId;

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }



    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
