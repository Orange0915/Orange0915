package com.william.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(Station.TAIPEI_CITY.name, Station.KAOHSUING_CITY.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of ticket?(Normal:1, Student:2, Elder:3)");
        int type = Integer.parseInt(scanner.next());
        switch (type){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        System.out.println("Your start station? (Taipei:1, Taichung:2, Kaohsiung:3)");
        int choice = Integer.parseInt(scanner.next());
        Station startStation = null;
        switch (choice){
            case 1:
                startStation = Station.TAIPEI_CITY;
                break;
            case 2:
                startStation = Station.TAICHUNG_CITY;
                break;
            case 3:
                startStation = Station.KAOHSUING_CITY;
                break;
        }
        System.out.println("Your end station? (Taipei:1, Taichung:2, Kaohsiung:3)");
        choice = Integer.parseInt(scanner.next());
        Station endStation = null;
        switch (choice){
            case 1:
                endStation = Station.TAIPEI_CITY;
                break;
            case 2:
                endStation = Station.TAICHUNG_CITY;
                break;
            case 3:
                endStation = Station.KAOHSUING_CITY;
                break;
        }
    }
}
