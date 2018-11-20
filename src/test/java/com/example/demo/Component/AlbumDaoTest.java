package com.example.demo.Component;

import com.example.demo.model.Album;
import com.example.demo.model.Song;
import com.example.demo.repository.AlbumDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.internal.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class AlbumDaoTest {

    @Autowired
    AlbumDAO albumDAO;

    @Test
    public void getAllTheUsers() {
        Album album = new Album();
        album.setName("Sin Limites");
        albumDAO.save(album);

        ArrayList<Album> albums = albumDAO.findAlbumByName("Sin Limites");

        assertEquals(1, albums.size()); //Check the result is only one objet retrieved
        assertNotEquals(0, albums.get(0).getAlbumId()); // check the id is different that 0 to check autoincrement
        assertEquals("Sin Limites", albums.get(0).getName()); // check album is retrieved correctly
    }
}
