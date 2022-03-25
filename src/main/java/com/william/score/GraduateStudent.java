package com.william.score;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int chinese, int science, int thesis){
        super(name, chinese, science);
        this.thesis = thesis;
    }
    public GraduateStudent(String name) {
        super((name));
    }
    @Override
    public void print() {
        System.out.println(name + "\t" + chinese + "\t" + science + "\t" + thesis);
    }
    public void test() {

    }
}
