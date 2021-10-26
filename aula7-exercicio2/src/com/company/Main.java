package com.company;

import com.company.model.Arvore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Arvore> ornamentalList = new ArrayList<>();
        List<Arvore> frutiferaList = new ArrayList<>();

	    ArvoreFactory factory = new ArvoreFactory();

	    for (int i = 0; i < 50000; i++) {
	        ornamentalList.add(factory.buscarArvore(200, 400,"verde"));
        }

        for (int i = 0; i < 50000; i++) {
            frutiferaList.add(factory.buscarArvore(500, 300,"vermelho"));
        }

//        Arvore frutifera = factory.buscarArvore(500, 300,"vermelho");
//        Arvore ornamental = factory.buscarArvore(200, 400,"verde");
//        Arvore floral = factory.buscarArvore(100, 200, "azul");

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
