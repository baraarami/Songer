package com.Spring.Spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    String title;
    String artist;
    int songCount;
    int length;
    String imgUrl;

    public Album(){

    }

    public Album( String title , String artist , int songCount , int length , String imgUrl){
        this.title=title;
        this.artist=artist;
        this.songCount=songCount;
        this.length=length;
        this.imgUrl=imgUrl;
    }




    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }


    public int getSongCount(){
        return songCount;
    }

    public void setSongCount(int songCount){
        this.songCount=songCount;
    }


    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length=length;
    }


    public String getImgUrl(){
        return imgUrl;
    }

    public void setImgUrl(String imgUrl){
        this.imgUrl=imgUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id

    public Long getId() {
        return id;
    }



}
