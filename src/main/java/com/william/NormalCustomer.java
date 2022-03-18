package com.william;

public class NormalCustomer extends Shoping {
    String id;
    int amount;
    int coupon;
    public NormalCustomer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public NormalCustomer() {

    }
    public void print() {
        int money = amount - amount/1000*100;
        System.out.println(id + "\t" + amount + "\t" + money + "\t" + coupon);
    }
}
