package br.com.rsfot.stream;

import br.com.rsfot.domain.*;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamExample {
    public static void main(String[] args) {
        Artist a7x = new Artist("A7X", List.of(new Person("Jimmy"), new Person("Math")), "Londom");
        Artist guns = new Artist("Guns", List.of(new Person("Jimmy"), new Person("Math")), "Londom");
        Artist allanzinho = new Artist("Allanzinho", List.of(new Person("Allanzinho")), "Brazil");

        List<Artist> list = asList(a7x, guns, allanzinho);

        long totalOfArtistsFromLondo = list.stream()
                .filter(artist -> artist.isFrom("Londom"))
                .count();

        System.out.println(totalOfArtistsFromLondo);


        List<String> randomNames = Stream.of("Naruto", "Vegetaa")
                .toList();

        System.out.println(randomNames);


        Stream.of("oi eu sou o goku", "agora", "nada nada")
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);


        List<String> list1 = Stream.of("abc", "2bas", "sadfh", "0sadhg")
                .filter(str -> str.substring(0, 1).matches("\\d"))
                .toList();


        System.out.println(list1);


        List<Integer> list2 = Stream.of(List.of(1, 2), List.of(3, 4))
                .flatMap(List::stream)
                .toList();

        System.out.println(list2);

        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));


        tracks.stream()
                .sorted(Comparator.comparing(Track::getDurationInMinutes).reversed())
                .toList()
                .forEach(System.out::println);

        Track track1 = tracks.stream()
                .min(Comparator.comparing(track -> track.getName().length()))
                .get();

        System.out.println(track1);

    }
}
