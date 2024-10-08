package com.example.project;

public class TipCalculator {
    public static String calculateTip(int people, int percent, double cost) { 
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();          
        double tip = (int) (((cost * percent / 100) * 100) + 0.5) / 100.00 ; 
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + (cost + tip) + "\n");
        result.append("Per person cost before tip: " + "$" + (int)(((cost / people) * 100) + 0.5) / 100.00 + "\n");
        result.append("Tip per person: " + "$" + ((int) (((tip / people) * 100) + 0.5) / 100.00) + "\n");
        result.append("Total cost per person: " + "$" + (int) (((cost + tip) / people) * 100) / 100.00 + "\n") ;
        result.append("-------------------------------\n");
        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
