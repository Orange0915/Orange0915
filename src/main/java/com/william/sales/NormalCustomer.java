package com.william.sales;

import com.william.sales.Shoping;

public class NormalCustomer {
    String id;
    int amount;
    double coupon;
    public NormalCustomer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public NormalCustomer() {

    }
    public void print() {
        double money = amount - amount/1000*100;
        if (amount > 1000) {
            System.out.println(id + "\t" + amount + "\t" + money);
        } else {
            System.out.println(id + "\t" + amount + "\t" + "\t" +  money);
        }
    }
}
