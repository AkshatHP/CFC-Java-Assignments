package com.company.assignment1;

import java.util.Scanner;

public class Asg1_5 {
public static void main(String[] args) {
        System.out.println("Enter no.:");
        Scanner a = new Scanner (System.in);
        int no = a.nextInt();
        int count = 0;
        int num = no;

        while(no != 0){
        no = no / 10;
        count ++;
        }

        System.out.println("Digit of number "+num+ " is :" + count );
    }
}
