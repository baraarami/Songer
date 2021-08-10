package com.example.Song.songer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;
    String title;
    String artist;
    Integer songCount ;
    Integer length;
    String imgUrl;

    @OneToMany(fetch = FetchType.EAGER , mappedBy = "album")
    List<Song>songs;
    public Album(){};
    public Album(String title, String artist, Integer songCount, Integer length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public Integer getLength() {
        return length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
