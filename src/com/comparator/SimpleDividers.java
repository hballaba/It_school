package com.comparator;

import java.util.LinkedList;

public class SimpleDividers implements Comparable<SimpleDividers> {

    private Integer number;

    public SimpleDividers(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    private boolean isSimple(Integer num){

        if (num > 2) {
            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "SimpleDividers{" +
                "number=" + number +
                '}';
    }

    private LinkedList<Integer> multiply(Integer num){
        LinkedList<Integer> vector = new LinkedList<>();
        for (int i = 1; i <= num; i++){
            if(isSimple(i)){
                vector.add(i);
            }
        }
        return vector;
    }

    private int CountSimpleDividers(SimpleDividers ex){
        int count = 0;
        if (isSimple(ex.getNumber())){
            return 2;
        }
        LinkedList<Integer> vector = multiply(ex.getNumber());
        for(int i = 0; i < vector.size(); i++){
            if(ex.getNumber() % vector.get(i) != 0){
                vector.remove(i--);
            }
        }
        count = vector.size();
        return count;
    }

    @Override
    public int compareTo(SimpleDividers ex) {
        if(CountSimpleDividers(this) > CountSimpleDividers(ex)){
            return 1;
        }
        else if (CountSimpleDividers(this) < CountSimpleDividers(ex)){
            return -1;
        }
//        System.out.println(0);
        else if (this.number > ex.number){
            return 1;
        }
        else if (this.number < ex.number){
            return -1;
        }
        return 0;
    }
}
