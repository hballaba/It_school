package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;
import com.zoo.interfaces.NotDrinkig;
import com.zoo.interfaces.Ugh;

public class Camel extends Animal implements Ugh, NotDrinkig {

    public Camel(String name)  {

        super(name);
        this.age = 0;
        System.out.println("Hello i am camel, my name is " + name);
    }

    public Camel(String name, int age)  {

        super(name);
        this.age = age;
        System.out.println("Hello i am camel, my name is " + name +
                " and i am " + age + " years old");
    }



    @Override
    public void say(){
        System.out.println("Camel");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am camel");
    }

    @Override
    public void friengAnimal(Animal animal) {
        System.out.println(this.name + " is friendly with " + animal.name);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Invalide value age " + age);
        }
        this.age = age;
    }

    @Override
    public void setName(String name) throws NameException {
        if (name.length() == 0) {
            throw new NameException("Empty name");
        }
        this.name = name;
    }


    @Override
    public int addinational(int a, int b) {
        return a + b;
    }

    @Override
    public String addinational(String a, String b) {
        return a + b;

    }

    public void ugh() {
        System.out.println("ugh");
    }

    public void notDrinkig() {
        System.out.println("I may not drink for a month");
    }
}