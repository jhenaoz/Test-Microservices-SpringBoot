package com.example.demo.service.transformer;

import com.example.demo.model.Album;
import com.example.demo.service.DTO.AlbumDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlbumTransformer {

    @Autowired
    ModelMapper modelMapper;

    public Album convertToEntity(AlbumDTO albumDto) {
        return modelMapper.map(albumDto, Album.class);
    }

    public AlbumDTO convertToDTO(Album album) {
        return modelMapper.map(album, AlbumDTO.class);
    }

}
