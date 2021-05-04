package com.comparator;

import java.util.Comparator;

public class DifferentNumbers {

   private Integer number;

    public DifferentNumbers(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "DifferentNumbers{" +
                "number=" + number +
                '}';
    }

}


class CompareDifferentNumbers implements Comparator<DifferentNumbers> {


    private int getCount(DifferentNumbers elem){
        int count = 0;
        Integer number = elem.getNumber();

//        System.out.println(elem.getNumber());

        number.byteValue()


        return count;
    }



    @Override
    public int compare(DifferentNumbers elem1, DifferentNumbers elem2) {
        int countNumbers1= getCount(elem1);
        int countNumbers2= 0;

        return 0;
    }
}