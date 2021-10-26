package com.company.server.impl;

import com.company.model.Tipo;
import com.company.model.Usuario;
import com.company.server.IDownload;

public class DownloadProxy implements IDownload {

    private DownloadServive downloadServive = new DownloadServive();

    @Override
    public void baixar(Usuario usuario) {
        if(usuario.getTipo().equals(Tipo.PREMIUM)) {
            downloadServive.baixar(usuario);
        } else {
            System.out.println("Você é pobre meu anjo");
        }
    }

}
