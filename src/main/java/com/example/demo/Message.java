package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String author;
    @NotNull
    @Size(min=5)
    private String content;

    private String image;

    public Message() {
    }

    public Message(String title, String author, @NotNull @Size(min = 5) String content, String image) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.image = image;
    }

    public Message(String music, String efrem, String s) {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
