package com.company.assignment1;

public class Asg1_7_g {

    public static void fillCross(int n) {

        int rowmirr =0;
        int row = 0;
        while(rowmirr < 2*n-1){

            int colmirr = 0;
            int coln = 0;
            while (colmirr < 2*n-1) {

                if(coln < row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                if (colmirr < n-1) {
                    coln++;
                }else{
                    coln--;
                }

                colmirr++;
            }
            System.out.println();
            if(rowmirr < n-1){
                row++;
            }else{
                row--;
            }
            rowmirr++;
        }


    }

    public static void main(String[] args) {
        fillCross(5);
    }
}
