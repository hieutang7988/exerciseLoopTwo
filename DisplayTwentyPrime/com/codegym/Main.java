package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers , N = 2;
        boolean check = true;

        System.out.print("Nhập vào numbers: ");
        numbers = scanner.nextInt();

        for (int count = 0  ; count < numbers; ) {
                for (int j = 2 ; j <= Math.sqrt(N); j++) {
                    if (N % j == 0) {
                       check = false;
                       break;
                    }
                }

                if(check == true) {
                    System.out.printf("%d  ", N);
                    count++;
                }
            check = true;
            N++;
            }
        }
    }


