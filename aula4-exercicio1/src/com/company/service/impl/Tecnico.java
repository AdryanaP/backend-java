package com.company.service.impl;

import com.company.model.Email;
import com.company.service.CheckEmail;

public class Tecnico extends CheckEmail {
    @Override
    public void processarEmail(Email email, String nomeDestinatario) {
        String[] arrayEmail = email.getDestino().split("@");

        if(nomeDestinatario.equals("tecnico") && arrayEmail[1].equals("colmeia.com")) {
            System.out.println("Esse Email é do tecnico e chegou ao seu destinatário.");
        } else {
            System.out.println("Esse Email é um spam");
        }
    }
}
