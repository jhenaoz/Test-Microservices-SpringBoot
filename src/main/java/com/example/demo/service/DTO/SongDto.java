package com.example.demo.service.DTO;

import org.springframework.hateoas.ResourceSupport;

public class SongDto extends ResourceSupport {
    private int songId;
    private int duration;
    private String name;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
