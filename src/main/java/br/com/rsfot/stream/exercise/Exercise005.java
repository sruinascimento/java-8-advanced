package br.com.rsfot.stream.exercise;

import java.util.*;

public class Exercise005 {
    public static void main(String[] args) {

        System.out.println("Criar uma lista de números inteiros.");
        List<Integer> numbers = createListOfRandomNumbers(10);
        System.out.println(numbers);


        System.out.println("Filtrar os números ímpares.");
        numbers.stream()
                .filter(it -> it % 2 != 0)
                .forEach(System.out::println);

        System.out.println(" Elevar ao quadrado cada número ímpar resultante.");

        numbers.stream()
                .filter(it -> it % 2 != 0)
                .map(odd -> odd * odd)
                .forEach(System.out::println);



    }

    private static List<Integer> createListOfRandomNumbers(int size) {
        final var random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }

        return numbers.stream().sorted().toList();
    }
}
