package ru.alexandr.sportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportAppApplication {

    public static void main(String[] args) {
        // args = new String[1];
        // args[0] = "--debug";
        SpringApplication.run(SportAppApplication.class, args);

    }

}
