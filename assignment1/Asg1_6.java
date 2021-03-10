package com.company.assignment1;

import java.util.Scanner;

public class Asg1_6 {
    public static void main(String[] args) {
        System.out.println("Enter no.:");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(rev);
    }
}
