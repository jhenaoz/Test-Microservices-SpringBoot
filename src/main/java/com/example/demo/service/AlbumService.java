package com.example.demo.service;

import com.example.demo.repository.AlbumDAO;
import com.example.demo.service.DTO.AlbumDTO;
import com.example.demo.service.transformer.AlbumTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbumService {

    @Autowired
    AlbumDAO albumDAO;

    @Autowired
    AlbumTransformer albumTransformer;

    public ArrayList<AlbumDTO> getAlbums() {
        ArrayList<AlbumDTO> albums = new ArrayList<AlbumDTO>();
        albumDAO.findAll().forEach(album -> {
            albums.add(albumTransformer.convertToDTO(album));
        });
        return albums;
    }

    public AlbumDTO getAlbumById(int id) {
        return albumTransformer.convertToDTO(albumDAO.findById(id).get());
    }
}
