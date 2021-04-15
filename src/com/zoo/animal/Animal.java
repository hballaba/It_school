package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;

public abstract class Animal{

    Animal(String name) {
        this.name = name;
    }

    protected String name;
    protected int age;

    public abstract void say();


    public abstract void getTypeAnimal();

    public abstract void friengAnimal(Animal animal);

    public abstract int addinational(int a, int b);

    public abstract String addinational(String a, String b);


    public abstract String getName();
    public abstract int getAge();

    public abstract void setAge(int age) throws AgeException;
    public abstract void setName(String name) throws NameException;


}
