package com.company.service;

import com.company.model.Email;

public abstract class CheckEmail {

    protected CheckEmail proximoDestinatario;

    public CheckEmail setProximoDestinatario(CheckEmail proximoDestinatario) {
        this.proximoDestinatario = proximoDestinatario;
        return this;
    }

    public abstract void processarEmail(Email email, String Destinatario);

}
