//package com.example.Song.songer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.view.RedirectView;
//
//import java.util.Locale;
//
//@Controller
//public class SongrController {
//    @Autowired
//    AlbumRepo albumRepo;
//
//    @GetMapping("/hello")
//
//    public String home() {
//        return "HELLOWORLD";
//    }
//
//
//    @GetMapping("/capitalize/{word}")
//    public String anyWord(Model m , @PathVariable("word") String word){
//       m.addAttribute("word" , word.toUpperCase());
//        return "CAPITALIZE.html";
//    }
//
//   @GetMapping("/home")
//    public String index(){
//        return "index.html";
//    }
//
//
//    @GetMapping("/albums")
//    public String getAlbum(Model m){
//        m.addAttribute("album" , albumRepo.findAll());
//        return "Albums.html";
//    }
//
//    @GetMapping("/addAlbum")
//    public String getAddAlbumView(){
//        return "addAlbum.html";
//    }
//
//    @GetMapping("/albums")
//    public RedirectView addAlbum(@RequestParam (value = "title") String title,
//                                @RequestParam (value = "artist") String artist,
//                                 @RequestParam (value = "songCount") Integer songCount,
//                                 @RequestParam (value = "length")  Integer length,
//                                 @RequestParam (value = "imgUrl") String imgUrl){
//        Album album = new Album(title,artist,songCount,length,imgUrl);
//        albumRepo.save(album);
//        return new RedirectView("/albums");
//    }
//
//}
