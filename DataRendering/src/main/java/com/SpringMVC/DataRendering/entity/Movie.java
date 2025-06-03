package com.SpringMVC.DataRendering.entity;


public class Movie {
    private String name;
    private String director;
    private String heroine;
    private String Genre;

    public Movie(String name, String director, String heroine, String genre) {
        this.name = name;
        this.director = director;
        this.heroine = heroine;
        Genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getHeroine() {
        return heroine;
    }

    public String getGenre() {
        return Genre;
    }
}
