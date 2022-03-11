package com.william;

public class Student {
    String name;
    int chinese;
    int science;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int chinese, int science) {
        this(name);
    //    this.name = name;
        this.chinese = chinese;
        this.science = science;
    }
    public void print() {
        int average = (chinese+science)/2;
        System.out.print(name + "\t" + chinese + "\t" + science);
        if (average < 68) {
            System.out.print("\t");
            System.out.println("*");
        }
        System.out.println();
    }
}
