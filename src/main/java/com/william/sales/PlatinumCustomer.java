package com.william.sales;

public class PlatinumCustomer extends NormalCustomer{
    public PlatinumCustomer(String id, int amount) {
        super(id, amount);
    }
    public void print() {
        double money = amount*0.7;
        double coupon = amount*0.2;
        if (amount < 1000) {
            System.out.println(id + "\t" + amount + "\t" + "\t" + money + "\t" + "\t" + coupon);
        } else System.out.println(id + "\t" + amount + "\t"  + money + "\t" + coupon);
    }
}
