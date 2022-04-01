package com.william.sales;

import java.util.ArrayList;
import java.util.List;

public class Shoping {
    public static void main(String[] args) {
        //NormalCustomer c1 = new NormalCustomer("0001", 1200);
        //SilverCustomer c2 = new SilverCustomer("0002", 800);
        //SilverCustomer c3 = new SilverCustomer("0003", 1200);
        //GoldenCustomer c4 = new GoldenCustomer("0004", 2000);
        //PlatinumCustomer c5 = new PlatinumCustomer("0005", 4000);
        //c1.print();
        //c2.print();
        //c3.print();
        //c4.print();
        //c5.print();


        List<NormalCustomer>customers = new ArrayList<>();
        customers.add(new NormalCustomer("001", 1200));
        customers.add(new NormalCustomer("002", 800));
        customers.add(new SilverCustomer("003", 2000));
        customers.add(new NormalCustomer("006", 500));
        customers.add(new GoldenCustomer("007", 900));
        for (NormalCustomer c : customers ) {
            c.print();
        }
    }
}
