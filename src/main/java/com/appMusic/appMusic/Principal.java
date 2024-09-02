package com.appMusic.appMusic;

import com.appMusic.appMusic.service.ConectionAPI;

import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private String URL = "https://www.vagalume.com.br/";
    private String key = "/index.js";
    private ConectionAPI consumoAPI = new ConectionAPI();

    public void exibirMenu() {
        System.out.println("""
                1- Adicionar cantor
                
                0- Sair
                """);
        var choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                adicionarCantor();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
        }
    }

    private void adicionarCantor() {
        System.out.println("What is the singer's name?");
        var singer = scanner.nextLine();

        var json = consumoAPI.obterDados(URL + singer + key);
        System.out.println(json);
    }
}
