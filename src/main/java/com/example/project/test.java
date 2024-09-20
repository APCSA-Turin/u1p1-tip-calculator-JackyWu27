package com.example.project;

public class test {
    public static void main(String[] args) {
        int percent = 25;
        double cost = 52.27;          
        System.out.println(cost * percent );
        System.out.println(cost * percent / 100);
        System.out.println((cost * percent / 100) * 100);
        System.err.println((int) ((cost * percent / 100) * 100) / 100.00);
    }
}
