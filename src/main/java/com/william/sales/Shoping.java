package com.william.sales;

public class Shoping {
    public static void main(String[] args) {
        NormalCustomer c1 = new NormalCustomer("0001", 1200);
        SilverCustomer c2 = new SilverCustomer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 1200);
        GoldenCustomer c4 = new GoldenCustomer("0004", 2000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
