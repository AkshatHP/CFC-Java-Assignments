package com.company.assignment1;
// Print even number after odd number jump
public class Asg1_4 {
    public static void main(String[] args) {
        int i = 1 ;
        int evenNum = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.print(i + " ");
                i = i + (2* (evenNum+1));
                evenNum += 2;
            }else{
                i++;
            }

        }
    }
}
