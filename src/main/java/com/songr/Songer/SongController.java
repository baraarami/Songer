package com.Spring.Spring;

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
    AlbumRepository albumRepository;

    @GetMapping("/hello")
    public String home(){
        return "HelloWorld";
    }

@GetMapping("/capitalized/{word}")
    public String anyWord(Model m , @PathVariable("word") String word){
        m.addAttribute("word" , word.toUpperCase());
        return "CAPITALIZED";
}

@GetMapping ("/Album")
    public String getAlbum(Model m){
        m.addAttribute("album" , albumRepository.findAll());
        return "Album";
}

@GetMapping ("/AddAlbum")
    public String getAddAlbumView(){
        return "AddAlbum";
}

@PostMapping("/Album")
public RedirectView addAlbum(@RequestParam(value = "title") String title ,
                             @RequestParam(value = "artist")String artist ,
                             @RequestParam(value = "songCount")int songCount ,
                             @RequestParam(value = "length")int length ,
                             @RequestParam(value = "imgUrl")String imgUrl ){
        Album album= new Album(title , artist , songCount, length , imgUrl);
        albumRepository.save(album);
        return new RedirectView("/album");
}



}
