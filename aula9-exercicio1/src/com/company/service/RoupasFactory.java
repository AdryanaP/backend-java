package com.company.service;

import com.company.Roupa;
import com.company.Tamanho;
import com.company.Tipo;

import java.util.HashMap;
import java.util.Map;

public class RoupasFactory {
    private static final Map<String, Roupa> flyweight = new HashMap<>();

    public Roupa getRoupa(Tamanho tamanho, Tipo tipo, Boolean eNova, Boolean eImportada) {

        String id = "tipo:" + tipo.toString();

        if(!flyweight.containsKey(id)) {
            flyweight.put(id, new Roupa(tamanho, tipo, eNova, eImportada));
            Integer contador = Roupa.getContador();
            contador++;
            Roupa.setContador(contador);
        }

        return flyweight.get(id);
    }
}
