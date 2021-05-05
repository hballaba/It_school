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

        if(number < 0){
            number *= -1;
        }
        String str = number.toString();

        int  arr[];
        arr = new int[10];

        for(int i = 0 ; i < str.length(); i++){
            int index = (str.charAt(i) - '0');
            if (arr[index] == 0) {
                count++;
            }
            arr[index] = 1;
        }
        return count;
    }

    @Override
    public int compare(DifferentNumbers elem1, DifferentNumbers elem2) {
        int countNumbers1= getCount(elem1);
        int countNumbers2= getCount(elem2);
        if (countNumbers1 > countNumbers2) {
            return 1;
        }
        else if (countNumbers1 < countNumbers2) {
            return -1;
        }
        else if (elem1.getNumber() > elem2.getNumber()) {
            return 1;
        }
        else if (elem1.getNumber() < elem2.getNumber()) {
            return -1;
        }

        return 0;
    }
}