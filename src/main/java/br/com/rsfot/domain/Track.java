package br.com.rsfot.domain;

public class Track {
    private String name;
    private float durationInMinutes;

    public Track(String name, float durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public float getDurationInMinutes() {
        return durationInMinutes;
    }
}
