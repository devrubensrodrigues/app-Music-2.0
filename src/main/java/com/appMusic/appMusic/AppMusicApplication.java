package com.appMusic.appMusic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMusicApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AppMusicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibirMenu();
    }
}
