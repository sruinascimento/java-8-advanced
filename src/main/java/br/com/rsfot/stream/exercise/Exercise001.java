package br.com.rsfot.stream.exercise;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise001 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //1
        //a)
        System.out.println("Encontrar a soma de todos os números.");

        Integer sum = numbers.stream().reduce(0, (acc, value) -> acc + value);
        System.out.println(sum);

        //b)
        System.out.println("Filtrar os números pares e criar uma nova lista com eles.");

        numbers.stream()
                .filter(it -> it % 2 == 0)
                .toList()
                .forEach(System.out::println);

        EvenPredicate evenPredicatePredicate = number -> number % 2 == 0;
        numbers.stream()
                .filter(it -> evenPredicatePredicate.isEven(it))
                .toList()
                .forEach(System.out::println);

        //c)
        System.out.println("Calcular o quadrado de cada número na lista.");

        numbers.stream()
                .map(it -> Math.pow(it, 2))
                .forEach(System.out::println);

        numbers.stream()
                .map(it -> it * it)
                .forEach(System.out::println);
    }

    interface EvenPredicate {
        boolean isEven(int number);
    }
}
