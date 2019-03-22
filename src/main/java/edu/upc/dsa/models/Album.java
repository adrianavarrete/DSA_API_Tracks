package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.List;

public class Album {

    private String id;
    private String autor;
    private List<Track> listaTrack;

    public Album(){

        this.id = RandomUtils.getId();
    }

    public Album(String autor, List<Track> listaTrack) {
        this();
        this.autor = autor;
        this.listaTrack = listaTrack;
    }
}


