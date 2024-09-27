package com.example.project;

public class test {
    public static void main(String[] args) {
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        double tip = (int) (((cost * percent / 100) * 100) + 0.5) / 100.00 ;
        
        System.out.println((int) ((((cost + tip) / people) * 100) + 0.5) / 100.00);
        System.out.println(((((cost + tip) / people) * 100) + 0.5) );
        System.out.println(((cost + tip) / people) * 100);
        System.out.println((cost + tip) / people);
    }
}
