package com.william;

public class Scoring {
    public static void main(String[] args) {
        Student Jhin = new Student("Jhin", 80, 10);
//        Jhin.name = "Jhin";
        Student Jinx = new Student("Jinx", 20, 84);
        GraduateStudent Jane = new GraduateStudent("Jane");
        Jhin.print();
        Jinx.print();
        Jane.print();
    }
}
