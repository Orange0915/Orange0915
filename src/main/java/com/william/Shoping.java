package com.william;

public class Shoping {
    public static void main(String[] args) {
        NormalCustomer c1 = new NormalCustomer("0001", 1200);
        SilverCustomer c2 = new SilverCustomer("0002", 800);
        c1.print();
        c2.print();
    }
}
