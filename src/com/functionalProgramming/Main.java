package com.functionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Swimmer swimmer = new Swimmer("Аlexandr Popov", 35);
        swimmer.swim(System.out::println);

        Supplier<String> nameSwimmer = () -> swimmer.getName();
        String name = nameSwimmer.get();
        System.out.println(name);


        BiConsumer<String, Integer> biConsumer = swimmer::setNameAge;
        biConsumer.accept("The best", 18);
        System.out.println(swimmer);

    }
}






//1. Создайте класс Swimmer с полем String name, Integer age
//2. Создайте метод swim(Consumer<String> c)
//3. Создайте объект Swimmer, передайте лямбду в swim(...), чтобы вывести в консоль имя пловца
//4. Создайте переменную Supplier<String>, напишите лямбду, которая вернет имя пловца (для объекта из п.3)
//5. Создайте лямбду BiConsumer<String, Integer>, которая в объект Swimmer установит name и age;