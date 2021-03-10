package com.company.assignment1;

import java.util.Scanner;

public class Asg1_2 {
    public static void main(String[] args) {
        System.out.println("Amount:");
        Scanner a= new Scanner (System.in);
        int amount = a.nextInt();

        System.out.println("Rate:");
        Scanner b= new Scanner (System.in);
        int rate = b.nextInt();

        System.out.println("time:");
        Scanner c= new Scanner (System.in);
        int time = c.nextInt();

        double SimpleInt = (amount * rate * time) / 100.0;
        System.out.println(SimpleInt);

    }
}
