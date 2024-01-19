package br.com.rsfot.domain;

import java.util.*;

import static java.util.Collections.unmodifiableList;

public class Album {
    private String name;
    private List<Track> tracks = new ArrayList<>();
    private List<Artist> musicians = new ArrayList<>();

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return unmodifiableList(tracks);
    }

    public List<Artist> getMusicians() {
        return unmodifiableList(musicians);
    }
}
