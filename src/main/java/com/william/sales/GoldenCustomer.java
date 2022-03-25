package com.william.sales;

import com.william.sales.NormalCustomer;

public class GoldenCustomer extends NormalCustomer {
    float discount = 0.1f;
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }
    public void print() {
        int money = amount - amount/1000*200;
        coupon = amount/1000*200;
        if (amount < 1000) {
            System.out.println(id + "\t" + amount + "\t" + "\t" + money + "\t" + "\t" + coupon);
        } else System.out.println(id + "\t" + amount + "\t"  + money + "\t" + coupon);
    }
}
