package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.NameException;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
