package com.functionalProgramming;

import java.util.*;
import java.util.function.*;

public class Main {

    static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> list = new LinkedList<>();
        Iterator<T> it = origin.iterator();
        while(it.hasNext()) {
            T item = it.next();
            list.add(mapper.apply(item));
        }
        return list;
    }



    static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        Iterator<T> iterator = origin.iterator();
        while(iterator.hasNext()) {
            T item = iterator.next();
            consumer.accept(item);
        }
    }

    static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        List<T> list = new LinkedList<>();
        Iterator iterator = origin.iterator();
        while(iterator.hasNext()) {
            T item = (T) iterator.next();
            if(predicate.test(item)) {
                list.add(item);
            }
        }

        return list;
    }

    static <T> Integer count(List<T> origin, Predicate<T> predicate) {
        Iterator iterator = origin.iterator();
        Integer count = 0;
        while(iterator.hasNext()) {
            T item = (T) iterator.next();
            if(predicate.test(item)) {
                count++;
            }
        }

        return count;
    }



    static <T> T foldRight (List<T> origin, BinaryOperator<T> accumulator){
        T result = null;
        Iterator<T> iterator = origin.iterator();
        if (iterator.hasNext()){
            result = iterator.next();
        }

        while(iterator.hasNext()) {

            T item = iterator.next();
            result =  accumulator.apply(result, item);
        }
       return result;
    }

    static <T> T foldLeft (List<T> origin, BinaryOperator<T> accumulator){
        T result = null;
        Collections.reverse(origin);
        Iterator<T> iterator = origin.iterator();
        if (iterator.hasNext()){
            result = iterator.next();
        }
        while(iterator.hasNext()) {

            T item = iterator.next();
            result =  accumulator.apply(result, item);
        }
        return result;
    }

    public static void main(String[] args) {

        Swimmer swimmer = new Swimmer("Аlexandr Popov", 35);
        swimmer.swim(System.out::println);

        Supplier<String> nameSwimmer = () -> swimmer.getName();
        String name = nameSwimmer.get();
        System.out.println(name);


        BiConsumer<String, Integer> biConsumer = swimmer::setNameAge;
        biConsumer.accept("The best", 18);
        System.out.println(swimmer);


        // TriFuncrion
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;
        System.out.println("triFunction - " + triFunction.apply(1, 2, 3));

        TriFunction triFunction1;
        triFunction = (a, b, c) -> a + b + c;
        System.out.println("triFunction - " + triFunction. apply(1, 2, 3));



//       QuadFunction
        QuadFunction<String, String, String, String, String> quadFunction = (a, b, c, d) -> a + " " + b + " " + c + " " + d;
        System.out.println(quadFunction. apply("This", "is", "the", "QuadFunction"));

        QuadFunction quadFunction1;
        quadFunction = (a, b, c, d) -> a + " " + b + " " + c + " " + d;
        System.out.println(quadFunction.apply("This", "is", "the", "QuadFunction #2"));


        //map
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("map - " + map(arr, (a-> a * 2)));


        // forEach
        System.out.print("forEach - ");
        forEach(arr, System.out::print);
        System.out.println();

        //filter
        System.out.println("After filter - " + filter(arr, (a -> a > 5)));

        //count
        System.out.println("Count = " + count(arr, (a -> a > 5)));

        //foldRight
        System.out.println("foldRight = " + foldRight(arr, (a, b) -> (a - b)));


        //foldLeft
        System.out.println("foldLeft = " + foldLeft(arr, (a, b) -> (a - b)));





    }
}






//1. Создайте класс Swimmer с полем String name, Integer age
//2. Создайте метод swim(Consumer<String> c)
//3. Создайте объект Swimmer, передайте лямбду в swim(...), чтобы вывести в консоль имя пловца
//4. Создайте переменную Supplier<String>, напишите лямбду, которая вернет имя пловца (для объекта из п.3)
//5. Создайте лямбду BiConsumer<String, Integer>, которая в объект Swimmer установит name и age;



//1. Создайте интерфейс TriFunction
//2. Создайте интерфейс QuadFunction
//3. Создайте лямбду для каждого интерфейса



//Реализовать
//1.
//static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
//// do implement
//    return null;
//} из массива одного типа в массива в другого типа
//
//2.
//static <T> void forEach(List<T> origin, Consumer<T> consumer) {
//        // do implement
//}
//
//3.
//static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
//// do implement
//    return null;
//}
//
//5.
//реализуйте по аналогии count(...), foldLeft(...) foldRight(...)