package br.com.rsfot.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise002 {
    public static void main(String[] args) {
        List<String> words = List.of("Oi eu sou o Goku", "Amor", "Açaí", "Jambu", "Farinha");

        //2
        //a
        System.out.println("Filtrar as palavras que começam com a letra 'A'.");

        words.stream()
                .filter(it -> it.toLowerCase().startsWith("a"))
                .forEach(System.out::println);



        //b
        System.out.println("Transformar todas as palavras para letras maiúsculas.");

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //c
        System.out.println("Concatenar todas as palavras filtradas em uma única string, separadas por vírgula.");

        String wordConcatenated = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(wordConcatenated);
    }
}
