package com.zoo.cage;

import com.zoo.animal.Animal;
import com.zoo.exception.ErrorAnimalExeption;

import java.util.HashSet;

public class Cage {

    private HashSet<Animal> cage;
    int freesize;
    private static final int MAX_SIZE = 3;
    private static int id;
    private int num;



    private Cage() {
        freesize = 5;
        num =id;
    }

    public static Cage createCage() throws ErrorAnimalExeption {
        if (id < MAX_SIZE) {
            id++;
            return new Cage();
         }
         else
             throw new ErrorAnimalExeption("The limit has been reached! Can not create new cage");
    }


    public boolean add(Animal animal) throws ErrorAnimalExeption {
        boolean bool = true;

            if (animal instanceof Animal) {
                if (freesize == 5){
                    cage = new HashSet<>();
                }
                if (cage.contains(animal)) {
                    throw new ErrorAnimalExeption("Animal " + animal.getName() + " there is already");
                }
                else if (freesize > 0){
                    System.out.println(animal.getName() + " welcome to cage № " + (num ));
                    cage.add(animal);
                    freesize--;
                }
                else {
                    throw new ErrorAnimalExeption("Cage is full");
                }
            }
            else {
                throw new ErrorAnimalExeption("Argument is not class Animal");
            }

        return bool;
    }

    public void delete(Animal animal) throws ErrorAnimalExeption {
        if (freesize == 5){
            System.out.println("Cage № " + num + " is empty!");
        }
        else if (cage.contains(animal)) {
            cage.remove(animal);
            System.out.println(animal.getName() + " left cage № " + num);
            freesize++;
        }
        else {
            System.out.println("Animal " + animal.getName() + " is not in the cage № " + num);
        }
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cage=" + cage +
                ", freesize=" + freesize +
                '}';
    }
}
