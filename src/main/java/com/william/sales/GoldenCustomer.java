package com.william.sales;

import com.william.sales.NormalCustomer;

public class GoldenCustomer extends NormalCustomer {
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }
    public void print() {
        double money = amount*0.9;
        coupon = amount*0.1;
        if (amount < 1000) {
            System.out.println(id + "\t" + amount + "\t" + "\t" + money + "\t" + coupon);
        } else System.out.println(id + "\t" + amount + "\t"  + money + "\t" + coupon);
    }
}
