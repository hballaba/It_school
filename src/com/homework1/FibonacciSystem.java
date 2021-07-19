package com.homework1;

import java.util.Scanner;

public class FibonacciSystem {


    public static int getFibonachy(int num) {

        int fib = 0;
        if (num < 0)
            return 0;
        else if (num == 0 || num == 1)
            return 1;
        else
            fib = getFibonachy(num - 1) +getFibonachy(num - 2);

        return fib;
    }

    public static void main(String[] args) {

        int fib = 0;
        int i = 0;
        int cek = 0;
        int tmp = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter positiv integer number:");

        while (!scan.hasNextInt()) {
            System.out.println("Wrong number!!!");
            scan.nextLine();
        }
        int num = scan.nextInt();

        for (i = 1; fib <= num; i++) {
            fib = getFibonachy(i);
        }
        i -=2;
        while (num > tmp) {
            cek = getFibonachy(i);
            tmp += cek;
            if (tmp > num) {
                System.out.print(0);
                i--;
                tmp -= cek;
                continue;
            }
            System.out.print(1);
            if (num != tmp) {
                System.out.print(0);
                i-=2;
            }
        }
        while (i > 1) {
            System.out.print(0);
            i--;
        }
    }
}
