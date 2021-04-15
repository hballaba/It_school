package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;
import com.zoo.interfaces.Cheat;
import com.zoo.interfaces.EatColobok;

public class Fox extends Animal implements EatColobok, Cheat {

    public Fox(String name)  {

        super(name);
        this.age = 0;
        System.out.println("Hello i am fox, my name is " + name);
    }

    public Fox(String name, int age)  {

        super(name);
        this.age = age;
        System.out.println("Hello i am fox, my name is " + name +
                " and i am " + age + " years old");
    }



    @Override
    public void say(){
        System.out.println("Hi");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am fox");
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

    public void cheat() {

        System.out.println("I'm the sneakiest");
    }

    public void eatColobok() {
        System.out.println("I an eating Kolobok");
    }
}