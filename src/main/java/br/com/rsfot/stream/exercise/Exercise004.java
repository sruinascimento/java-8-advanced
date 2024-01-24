package br.com.rsfot.stream.exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise004 {

    record Pessoa(String nome, int idade, String cidade) {
        public boolean idadeSuperiorATrintaNos() {
            return idade > 30;
        }
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(new Pessoa("Rui", 27, "Canaã"),
                new Pessoa("Ploop", 30, "Tucuruí"),
                new Pessoa("Javinha", 35, "Belém"),
                new Pessoa("Lois", 6, "Tucuruí"));

        System.out.println("Filtrar todas as pessoas com idade superior a 30 anos.");

        pessoas.stream()
                .filter(Pessoa::idadeSuperiorATrintaNos)
                .forEach(System.out::println);


        System.out.println("Agrupar as pessoas por cidade.");

        pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::cidade))
                .forEach((key, value) -> System.out.println("Cidade %s, name(s) %s".formatted(key, value)));

        System.out.println("Calcular a média de idade das pessoas em cada cidade.");

        pessoas.stream()
                .collect(Collectors.groupingBy(pessoa -> pessoa.cidade()))
                .forEach((String key, List<Pessoa>value) -> System.out.println("Cidade %s, media de idade %s".formatted(key, value.stream().mapToInt(Pessoa::idade).average().toString())));



    }
}
