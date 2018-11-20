package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Song {

    public Song() {}

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int songId;

    @Column
    private String name;

    @Column
    private int duration;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
