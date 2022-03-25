package com.william.sales;

public class SilverCustomer extends NormalCustomer {
    public SilverCustomer (String id, int amount) {
        super(id, amount);
    }
    public void print() {
        int money = amount - amount/1000*100;
        coupon = amount/1000*100;
        if (amount > 1000) {
            System.out.println(id + "\t" + amount + "\t" + money + "\t" + coupon);
        } else System.out.println(id + "\t" + amount + "\t" + "\t" +  money + "\t" + "\t" + coupon);
    }
    public int coupon() {
        return (int)(amount*0.1);
    }
}
