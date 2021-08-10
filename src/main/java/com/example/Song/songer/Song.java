package com.example.Song.songer;


import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String title ;
    private Integer length;
    private Integer trackNumber;

    @ManyToOne
    private Album album;
    public Song(){};
    public Song(String title, Integer trackNumber, Integer length, Album album) {
        this.title=title;
        this.trackNumber=trackNumber;
        this.length=length;
        this.album=album;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
