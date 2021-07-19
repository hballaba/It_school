package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;
import com.zoo.interfaces.Kick;
import com.zoo.interfaces.Milk;

public class Cow extends Animal implements Kick, Milk {

    public Cow(String name)  {

        super(name);
        this.age = 0;
        System.out.println("Hello i am cow, my name is " + name);
    }

    public Cow(String name, int age)  {

        super(name);
        this.age = age;
        System.out.println("Hello i am cow, my name is " + name +
                " and i am " + age + " years old");
    }


    @Override
    public void say(){
        System.out.println("Mu");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am cow");
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

    public void milk() {
        System.out.println("I'm giving milk");
    }

    public void kick() {
        System.out.println("I am kicking");
    }
}
