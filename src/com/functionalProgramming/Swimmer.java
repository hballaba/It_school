package com.functionalProgramming;

import java.util.function.Consumer;

public class Swimmer {
    private String name;
    private Integer age;

    public Swimmer() {

    }

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void swim(Consumer<String> c){
        c.accept(name);

    }

    public void setNameAge(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
