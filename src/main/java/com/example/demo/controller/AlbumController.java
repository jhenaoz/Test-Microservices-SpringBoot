package com.example.demo.controller;

import com.example.demo.service.AlbumService;
import com.example.demo.service.DTO.AlbumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<ArrayList<AlbumDTO>> getAlbums() {
        ArrayList<AlbumDTO> albums = new ArrayList<AlbumDTO>();
        albumService.getAlbums().forEach(albumDTO -> {
            albumDTO.add(linkTo(methodOn(AlbumController.class).getAlbumById(albumDTO.getAlbumId())).withRel("album"));
            albums.add(albumDTO);
        });
        return new HttpEntity<ArrayList<AlbumDTO>>(albums);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getAlbumById (@PathVariable("id") int id) {
        try {
            return new ResponseEntity(albumService.getAlbumById(id), HttpStatus.OK);
        } catch (NoSuchElementException exception) {
            return new ResponseEntity("Element not found", HttpStatus.NOT_FOUND);
        }
    }
}
