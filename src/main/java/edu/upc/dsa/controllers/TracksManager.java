package edu.upc.dsa.controllers;

import edu.upc.dsa.models.Autor;
import edu.upc.dsa.models.Track;

import java.util.List;

public interface TracksManager {


    public Track addTrack(String title, String singer);
    public Track addTrack(Track t);
    public Track updateTrack(Track t);
    public Track getTrack(String id);
    public List<Track> findAllTracks();
    public void deleteTrack(String id);

    public Autor addAutor(Autor a);
    public Autor getAutor(String id);
    public Autor updateAutor(String id);
    public List<Autor> findAllAutores();
    public void deleteAutor(String id);



    public int size();
}
