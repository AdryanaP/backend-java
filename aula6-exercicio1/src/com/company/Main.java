package com.company;

import com.company.service.Serie;
import com.company.service.SerieProxy;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Serie serie1 = new Serie("Amigos", 0);
        Serie serie2 = new Serie("Xuxa", 1);
        Serie serie3 = new Serie("Barbie", 5);
        Serie serie4 = new Serie("Barney", 2);

        List<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(serie1);
        listaSeries.add(serie2);
        listaSeries.add(serie3);
        listaSeries.add(serie4);

        SerieProxy proxy = new SerieProxy();

        for(Serie link: listaSeries) {
            if(link.getNome().equals("Barbie")) {
                int numeroViews = link.getQuantidadeViews();
                numeroViews++;
                link.setQuantidadeViews(numeroViews);
                System.out.println(proxy.getSerie(serie1));
            }
        }
    }
}
