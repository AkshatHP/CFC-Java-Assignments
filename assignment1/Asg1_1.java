package com.company.assignment1;

import java.util.Scanner;

public class Asg1_1 {
    public static void main(String[] args) {
        System.out.println("Enter credits:");
        Scanner s = new Scanner(System.in);
        int credits = s.nextInt();

//        System.out.println(credits);
        if (credits >= 7500) {
            System.out.println("Tera leader");
        }else if(credits >= 6000  ){
            System.out.println("Gega leader");
        }else if(credits >= 4500 ){
            System.out.println("Mega leader");
        }else{
            System.out.println("Rising star");
        }


    }
}
