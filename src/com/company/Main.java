package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number here");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is not Prime");
        } else {
            int i = 2;
            boolean check = true;
            for (; i < number; i++) {
                if (Math.sqrt(number) % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number+"  is Prime");
            } else {
                System.out.println(number+"  is Not Prime");
            }
        }
    }
}