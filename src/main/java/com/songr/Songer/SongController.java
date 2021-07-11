package com.songr.Songer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongController {

    @GetMapping("/hello")
    public String home(){
        return "HelloWorld";
    }

    @GetMapping("/capitalize/{word}")
    public String anyWord(Model m ,@PathVariable("word")String word ){
        m.addAttribute("word" , word.toUpperCase());

        return "CAPITALIZED";
    }

    @GetMapping("/albums")
    public String getAlbum(Model m){
        Album album1 = new Album("Without Me", "Without Me Halsey", 3 , 300 , "https://1.bp.blogspot.com/--HttxjSIPBQ/W-AuaqH-kHI/AAAAAAAAF2I/OiGiMkIhnTgz2JJlbMuKKIJfjJiUPnAIwCLcBGAs/s1600/1.jpg");
        Album album2 = new Album("Confident", "Justin Bieber", 10 , 600 , "http://upload.wikimedia.org/wikipedia/en/b/bb/Confident-Justin-Bieber-Chance-The-Rapper.jpg");
        Album album3 = new Album("It's You", "Ali Gatie", 20 , 400, "https://tse1.mm.bing.net/th?id=OIP.txMrPyHss9LH95rc5llFEgHaEK&pid=Api&P=0&w=295&h=167.jpg");
        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        m.addAttribute("albums" , albums);
        return "Album";
    }
}
