package com.company.service;

public class SerieProxy implements ISerie{

    @Override
    public String getSerie(Serie serie) {

        if(serie.getQuantidadeViews() > 5) {
            return new SerieNaoHabilitadaException("Excede o número de reproduções permitidas").toString();
        }
        return serie.getSerie(serie);
    }
}
