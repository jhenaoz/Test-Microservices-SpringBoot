package com.example.demo.repository;

import com.example.demo.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AlbumDAO extends CrudRepository<Album, Integer> {
    public ArrayList<Album> findAlbumByName(String name);
}
