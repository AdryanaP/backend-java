package com.company.service.impl;

import com.company.model.Email;
import com.company.service.CheckEmail;

public class Gerente extends CheckEmail {

    @Override
    public void processarEmail(Email email, String nomeDestinatario) {

        if(nomeDestinatario.equals("gerente")) {
            System.out.println("Esse Email é do gerente e chegou ao seu destinatário.");
        } else {
            this.proximoDestinatario.processarEmail(email, nomeDestinatario);
        }
    }
}
