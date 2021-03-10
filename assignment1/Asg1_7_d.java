package com.company.assignment1;

import java.util.Scanner;

public class Asg1_7_d {
    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int col = 1; col <= n; col++) {
            for (int row = n; row > col; row--) {
                System.out.print("  ");
            }
            for (int row = col; row < (2 * col); row++) {
                System.out.print(row + " ");
            }
            for (int row = (2 * (col - 1)); row >= col; row--) {
                System.out.print(row + " ");
            }
            System.out.println("");
        }
    }
}
