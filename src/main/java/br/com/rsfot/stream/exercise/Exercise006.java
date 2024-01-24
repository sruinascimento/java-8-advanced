package br.com.rsfot.stream.exercise;

import java.util.*;
import java.util.stream.Stream;

public class Exercise006 {
    public static void main(String[] args) {
        System.out.println("Concatenar as duas listas em uma única lista.");

        List<Integer> numbers = List.of(1, 2, 3, 4, 1, 2, 3, 4);
        List<Integer> numbers2 = List.of(10, 20, 30, 40, 10, 20, 30, 40);

        List<Integer> concatenedList = Stream.concat(numbers.stream(), numbers2.stream())
                .toList();

        System.out.println(concatenedList);


        System.out.println("Remover os números duplicados.");

        List<Integer> distinctNumbers = concatenedList.stream()
                .distinct()
                .toList();

        System.out.println(distinctNumbers);

        System.out.println("Calcular a média dos números resultantes.");

        OptionalDouble average = distinctNumbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(average.getAsDouble());

    }
}
