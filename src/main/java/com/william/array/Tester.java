package com.william.array;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = list.get(5);
        int n2 = list.get(3);
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
    }
}
