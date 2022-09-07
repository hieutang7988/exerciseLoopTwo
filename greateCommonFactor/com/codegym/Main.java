package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a ;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = input.nextInt();
        System.out.println("Enter num b");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0) {
            System.out.println("No greate common factor");
        }
        while (a != b) {
            if(a > b)
                a -=b;
            else
                b -= a;
        }
        System.out.println( " Greate commom factor :" + a);
    }
}
