package com.company.assignment1;

import java.util.Scanner;

public class Asg1_7_b {
    public static void main(String[] args) {
        System.out.println("Enter no.:");
        Scanner a = new Scanner (System.in);
        int no = a.nextInt();

        for(int i=1 ; i <= no ; i++){
            int num =1;
            for(int j=1 ; j <=i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

