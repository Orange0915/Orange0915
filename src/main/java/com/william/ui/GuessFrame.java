package com.william.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JButton button = new JButton("print");
    JLabel label = new JLabel("number");
    JTextField number  = new JTextField(10);
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });

        setLayout(new FlowLayout());
        add(label);
        add(button);
        add(number);
        setVisible(true);
    }
    public static void main(String[] args) {
        GuessFrame guessFram = new GuessFrame();
    }
}


