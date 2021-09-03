package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Please enter your grams:");
        //double grams=input.nextDouble();
        //System.out.println("Kilos: " + grams/1000 + " kg");

        int min = 0;
        int max = 100;

        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);

        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
