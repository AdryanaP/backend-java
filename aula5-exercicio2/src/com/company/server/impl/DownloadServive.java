package com.company.server.impl;

import com.company.model.Usuario;
import com.company.server.IDownload;

public class DownloadServive implements IDownload {

    @Override
    public void baixar(Usuario usuario) {

        System.out.println("Usuário " + usuario.getId() + " está apto para fazer download");

    }
}
