package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;
import com.zoo.interfaces.Smack;
import com.zoo.interfaces.WallowInMud;


public class Pig extends Animal implements WallowInMud, Smack {

    public Pig(String name)  {

        super(name);
        this.age = 0;
        System.out.println("Hello i am pig, my name is " + name);
    }

    public Pig(String name, int age)  {

        super(name);
        this.age = age;
        System.out.println("Hello i am pig, my name is " + name +
                " and i am " + age + " years old");
    }



    @Override
    public void say(){
        System.out.println("Xru-Xru");
    }

    @Override
    public void getTypeAnimal (){
        System.out.println("I am pig");
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

    public void wallowInMud() {
        System.out.println("I am wallowing in mud");
    }

    public void smack() {
        System.out.println("smack smack");
    }
}
