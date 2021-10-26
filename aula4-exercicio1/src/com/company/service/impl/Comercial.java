package com.company.service.impl;

import com.company.model.Email;
import com.company.service.CheckEmail;

public class Comercial extends CheckEmail {
    @Override
    public void processarEmail(Email email, String nomeDestinatario) {

        if(nomeDestinatario.equals("comercial")) {
            System.out.println("Esse Email é do comercial e chegou ao seu destinatário.");
        } else {
            this.proximoDestinatario.processarEmail(email, nomeDestinatario);
        }
    }
}
