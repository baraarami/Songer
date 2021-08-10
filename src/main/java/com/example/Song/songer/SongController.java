package com.example.Song.songer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

@Autowired
    AlbumRepo albumRepo;

@Autowired
    SongRepo songRepo;


@GetMapping("/songs")
    public String getAllSongs(Model m){
        m.addAttribute("songs" , songRepo.findAll());
        return "songs";
}

@GetMapping("/addSong")
    public String openAddSong(){
    return "addSongs";
}


@GetMapping("/album/{id}")
    public String getSongById(@PathVariable(value = "id") Integer id , Model m ){
    Album album = albumRepo.findById(id).get();
    m.addAttribute("album" , album);
    return "album";
}

@PostMapping("/songs")
    public RedirectView addSong(@RequestParam(value = "title") String title,
                                @RequestParam (value = "trackNumber") Integer trackNumber,
                                @RequestParam (value = "length") Integer length,
                                @RequestParam (value = "albumId") Integer albumId){
    Album album = albumRepo.findById(albumId).get();

    Song song= new Song(title , trackNumber , length , album);
    songRepo.save(song);
    return new RedirectView("songs");
}
}
