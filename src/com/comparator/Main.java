package com.comparator;

public class Main {
    public static void main(String[] args) {
        SimpleDividers simple = new SimpleDividers(1026);
        SimpleDividers simple2 = new SimpleDividers(23);


        System.out.println(simple.compareTo(simple2));

    }
}
