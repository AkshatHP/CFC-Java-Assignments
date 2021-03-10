package com.company.assignment1;

public class Asg1_7_i {
    public static  void pattern(int n){

        int row = 0 ;
        int rowmirr = 0;

        while (rowmirr < 2*n -1){

            int col = 0 ;
            int colmirr = 0 ;

            while (colmirr<2*n-1){

                if(col<row){
                    System.out.print(n-col + " ");
                }else {
                    System.out.print(n - row + " ");
                }
                if (colmirr >= n-1){
                    col--;
                }else {
                    col++ ;
                }
                colmirr++ ;
            }
            System.out.println(); //new line

            if (rowmirr >= n-1){
                row--;
            }else {
                row++ ;
            }
            rowmirr++ ;
        }
    }
    public  static void main(String[] args){
        pattern(5);
    }
}