package com.lahaus.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import java.io.*;

@RestController
public class Controller {

    /* Servicio para leer un archivo*/
    @GetMapping("leer")
    public String leer() throws IOException {

        URL url = new URL("https://storage.googleapis.com/lahaus/libro.txt");
        BufferedReader read = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String i;
        String texto = "";
        while ((i = read.readLine()) != null)
            texto = texto + i + "\n";
            System.out.println(texto);

        System.out.println(texto);
        read.close();

        return texto;
    }

    /* Servicio para verificar existencia */
    @GetMapping("existe")
    public String existe() throws IOException {

        URL url = new URL("https://storage.googleapis.com/lahaus/libro.txt");
        BufferedReader read = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String i;
        String resultado = "";
        while ((i = read.readLine()) != null)
            resultado = "existe";
        read.close();
        return resultado;
    }
}

