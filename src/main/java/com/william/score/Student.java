package com.william.score;

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
    public Student(){

    }
    public void print() {
        System.out.print(name + "\t" + chinese + "\t" + science + "\t" + getAverage());
        if (getAverage() < 68) {
            System.out.print("\t");
            System.out.println("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return (chinese+science)/2;
    }
}
