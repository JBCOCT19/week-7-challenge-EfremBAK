package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        repository.save(new Message("Music", "Efrem", "Do you know that the human vocal cord is the best instrument that exist. It is capable of producing the most variety of sounds interval tones. The closest man made instrument is the GUITAR!"));

        repository.save(new Message("Art", "Efrem", "Art is a form of expression and communication that is as old as humans ourselves. Talking/Speaking/Making sound to give and receive information is one of the basic forms of arts."));


    }
}
