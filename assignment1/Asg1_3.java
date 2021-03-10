package com.company.assignment1;

import java.util.Scanner;

public class Asg1_3 {
    public static void main(String[] args) {
        System.out.println("Enter first no.:");
        Scanner a = new Scanner(System.in);
        int firstNo = a.nextInt();

        System.out.println("Enter second no.:");
        Scanner b = new Scanner(System.in);
        int secondNo = b.nextInt();

        int gcd = 1;

        for(int i = 1; i <= firstNo && i <= secondNo; i++)
        {
            if(firstNo%i==0 && secondNo%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of "+firstNo+ " and "+secondNo+ " is " +gcd);
    }
}
