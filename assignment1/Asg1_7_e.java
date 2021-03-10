package com.company.assignment1;

import java.util.Scanner;

public class Asg1_7_e {

    public static void pasTriangle(int n) {
        int row = 0 ;
        while (row < n){
            int col = 0 ;
            while (col<=row){
                System.out.print(comb(row, col) + " ");
                col++ ;
            }
            System.out.println();
            row++ ;
        }}

    public static int fact(int n){ //Factorial
        if (n<1){ return 1 ; }
        else { return fact(n-1)*n;} //n!
    }

    public static int comb(int n, int r){ // Combination
        return fact(n)/(fact(n-r)*fact(r)); // n! / r!(n-r)!
    }

    public static void main(String[] args) {

        System.out.println("Enter NO.:");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        pasTriangle(no);

    }

}
