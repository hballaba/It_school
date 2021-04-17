package com.homeWork1;


import java.util.Scanner;

public class Abracadabra {

    private static void drawLine(int w){

        System.out.print('*');
        for (int i = 1; i < w; i++)
            System.out.print(' ');
        System.out.print('*');
        System.out.println();
    }
    private static void drawAbrakadabra(int w, String str){

        int i = (w - str.length())/ 2;
        System.out.print('*');
        for (int a = 0; a < i; a++)
            System.out.print(' ');
        i = i + str.length();
        System.out.print(str);
        while (++i < w)
            System.out.print(' ');

        System.out.println('*');
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter wildth frame");
        while(!scan.hasNextInt()) {
            String tmp = scan.next();
            System.out.println("Wrong number");
        }
        int w = scan.nextInt();

        System.out.println("Enter hight frame");
        while(!scan.hasNextInt()) {
            String tmp = scan.next();
            System.out.println("Wrong number");
        }
        int hi = scan.nextInt();

        System.out.println("Enter string less than " + w);

        String str = scan.next();

        if (w < str.length() + 2) {
            System.out.println("Error");
            return ;
        }

        for (int i = 0; i <= w; i++)
            System.out.print('*');
        System.out.println();

        for (int i = 0; i < hi; i++) {
            if (i == hi/2)
                drawAbrakadabra(w, str);
            else
                drawLine(w);

        }
        for (int i = 0; i <= w; i++)
            System.out.print('*');
        System.out.println();
    }
}
