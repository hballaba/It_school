package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;
import com.zoo.interfaces.Eating;
import com.zoo.interfaces.Scratch;

public class Cat extends Animal implements Scratch, Eating {

    private int eat;
    public Cat(String name)  {

        super(name);
        this.age = 0;
        eat = 0;
        System.out.println("Hello i am cat, my name is " + name);
    }

    public Cat(String name, int age)  {

        super(name);
        this.age = age;
        eat = 0;
        System.out.println("Hello i am cat, my name is " + name +
                            " and i am " + age + " years old");
    }



    @Override
    public void say(){
        System.out.println("Meow");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am cat");
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

    public void scratch(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("scratch ");
        }
        System.out.println();
    }

    public void eating() {
        eat++;
        System.out.println(name + " ate " + eat + " times");
    }
}
