package com.william;

public class GoldenCustomer extends NormalCustomer {
    float discount = 0.1f;
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }
    public void print() {
    }
}
