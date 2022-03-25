package com.william.ticket;

public class Station {
    public static final Station TAIPEI_CITY = new Station(100, "Taipei");
    public static final Station TAICHUNG_CITY = new Station(100, "Taichung");
    public static final Station KAOHSUING_CITY = new Station(100, "KAOHSUING");

    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
