package com.example.demo.service.DTO;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;

public class AlbumDTO extends ResourceSupport {

    private int albumId;
    private String name;
    private ArrayList<SongDto> songs;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SongDto> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<SongDto> songs) {
        this.songs = songs;
    }
}
