package com.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

//        Task #1

       Set<Integer> set =  Stream.generate(() -> new Random().nextInt() % 1000000)
        .filter(n -> n > 0 && n % 2 == 1)
        .map(n -> n * 2)
        .limit(15)
        .peek(System.out::println)
        .collect(Collectors.toSet());

        System.out.println("count elements in set = " + set.stream().count());

        System.out.println();
        System.out.println(set);



//        Task #2
        List<String> list1 = Arrays.asList("Ivan", "Hovard", "Ivan", "Bob");
        List<String> list2 = Arrays.asList("Elena", "Olga", "Olga", "Elena");
        List<String> list3 = Arrays.asList("Ivan", "Hovard", "Jon", "Jan");
        List<String> list4 = Arrays.asList("Alex", "Nik", "Tom");

        List<String> uniqe = Stream.of(list1, list2, list3, list4)
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqe);


        Map<String, Double> persons = new HashMap<>();
        persons.put("Ivan", 65.5);
        persons.put("Elena", 45.0);
        persons.put("Jon", 70.4);
        persons.put("Olga", 50.8);

        System.out.println();


        Double average =  persons.entrySet().stream()
               .flatMapToDouble(num -> DoubleStream.of(num.getValue()))
                .average().getAsDouble();
        System.out.println("Average age = " + average);

        System.out.println();


        List<Long> long1 = Arrays.asList(123L, 456L, 789L, 159L, 753L);
        List<Long> long2 = Arrays.asList(12L, 45L, 789L, 159L, 75L);

        long1.stream()
        .distinct()
        .filter(long2::contains)
        .forEach(System.out::println);
    }
}

//Task #1

//1.Создайте стрим из случайных положительных и отрицательных чисел
//2. Выберите только положительные, нечетные числа
//3. Умножьте каждое число на 2
//4. Выведите в консоль stream
//5. Сохраните результат 15-ти чисел в Set<Integer>
//6. Найдите сумму (используя stream api)


//Task #2

//1. На вход дано 4 списка имен (String),имена повторяются. Необходимо из данных списков сформировать один список уникальных имен.
//2. На вход дана Map<String,Double>(ключ-имя, значение-вес в кг), необходимо найти средний вес.
//3. На вход даны два списка List<Long>, необходимо найти пересечение и вывести результат.