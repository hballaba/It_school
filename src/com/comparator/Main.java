package com.comparator;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SimpleDividers simple1 = new SimpleDividers(31);
        SimpleDividers simple2 = new SimpleDividers(5564);
        SimpleDividers simple3 = new SimpleDividers(12646);
        SimpleDividers simple4 = new SimpleDividers(11);
        SimpleDividers simple5 = new SimpleDividers(123);
        SimpleDividers simple6 = new SimpleDividers(321);

        System.out.println(simple1.compareTo(simple2));
        System.out.println(simple3.compareTo(simple4));
        System.out.println(simple5.compareTo(simple6));

       Set<SimpleDividers> array = new TreeSet<>();
        array.add(simple1);
        array.add(simple2);
        array.add(simple3);
        array.add(simple4);
        array.add(simple5);
        array.add(simple6);
        for (SimpleDividers elem : array) {
            System.out.println(elem.toString());
        }


        DifferentNumbers diff1 = new DifferentNumbers(123321);
        DifferentNumbers diff2 = new DifferentNumbers(45);
        DifferentNumbers diff3 = new DifferentNumbers(123456);
        DifferentNumbers diff4 = new DifferentNumbers(987);
        DifferentNumbers diff5 = new DifferentNumbers(1);
        DifferentNumbers diff6 = new DifferentNumbers(454454545);

        CompareDifferentNumbers comparat = new CompareDifferentNumbers();
        comparat.compare(diff1, diff2);

    }
}
