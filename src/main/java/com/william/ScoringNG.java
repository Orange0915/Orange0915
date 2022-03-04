package com.william;

public class ScoringNG {
    public static void main(String[] args) {
        int[] chineses = {87, 49, 66, 79, 92};
        int[] sciences = {65, 77, 54, 96, 83};
        String[] name = {"Hank", "Elsa", "Zedd", "Jhin", "Sena"};
        for (int i=0; i<5; i++) {
            if (i!=0) {
                System.out.println(name[i] + "\t" + chineses[i] + "\t" + sciences[i] + "\t" + (chineses[i] + sciences[i]) / 2);
            }
        }
    }
}
