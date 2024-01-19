package br.com.rsfot.domain;

import java.util.*;

import static java.util.Collections.unmodifiableList;

public class Artist {
    private String name;
    private List<Person> members = new ArrayList<>();
    private String originCountry;

    public Artist(String name, List<Person> members, String originCountry) {
        this.name = name;
        this.members = members;
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public List<Person> getMembers() {
        return unmodifiableList(members);
    }

    public void addMember(Person person) {
        this.members.add(person);
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
