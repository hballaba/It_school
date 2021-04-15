package com.zoo;

import com.zoo.animal.*;
import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;

public class Main {
    public static void main(String[] args) {


        Cat bars = new Cat("Barsik");
        Cat pushok = new Cat("Pushok", 7);
        try {
            bars.setAge(5);
            bars.setAge(-1);
        }
        catch (AgeException ex) {
            System.err.println(ex.getMessage());
        }
        finally {

        }

        try {
            bars.setName("");
        }
        catch (NameException ex) {
            System.err.println(ex.getMessage());
        }
        finally {

        }
        System.out.println("Age = " + bars.getAge());
        bars.friengAnimal(pushok);
        int a = 2, b =3;
        String str1 = "IT", str2 = "School";

        System.out.println(a + " + " + b + " = " + bars.addinational(a, b));
        System.out.println(str1 + " + " + str2 + " = " + bars.addinational(str1, str2));
        bars.scratch(3);
        bars.eating();
        bars.eating();
        System.out.println();

        Dog bobik = new Dog("Bobik", 12);
        bobik.catchThief();
        bobik.secureAble();
        System.out.println();

        Cow burenka = new Cow("Burenka");
        burenka.milk();
        burenka.kick();
        System.out.println();

        Camel fred = new Camel("Fred");
        fred.notDrinkig();
        fred.ugh();
        System.out.println();

        Donkey donny = new Donkey("Donny");
        donny.driveWagon();
        donny.stubborn();
        System.out.println();

        Fox sly = new Fox("Sly");
        sly.cheat();
        sly.eatColobok();
        System.out.println();

        Pig piggy = new Pig("Piggy");
        piggy.smack();
        piggy.wallowInMud();
    }
}
