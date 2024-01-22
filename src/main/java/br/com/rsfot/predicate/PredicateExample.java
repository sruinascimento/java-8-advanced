package br.com.rsfot.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));


        Predicate<Integer> atLeast5 = number -> number > 5;

        System.out.println(atLeast5.test(5));
        System.out.println(atLeast5.negate().or(isEven).test(6));
    }
}
