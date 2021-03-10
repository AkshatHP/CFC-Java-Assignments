package com.company.assignment1;

import java.util.Scanner;

public class Asg1_7_c {

    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        int col = s.nextInt();

        for (int i = 0; i < col; i++) {
            for (int j = i; j < col; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j+" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
