package com.company;

import com.company.model.Tipo;
import com.company.model.Usuario;
import com.company.server.IDownload;
import com.company.server.impl.DownloadProxy;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(1, Tipo.PREMIUM);

        IDownload proxy = new DownloadProxy();

        proxy.baixar(usuario);
    }
}
