package com.company;

import com.company.model.Email;
import com.company.service.CheckEmail;
import com.company.service.impl.Comercial;
import com.company.service.impl.Gerente;
import com.company.service.impl.Tecnico;

public class Main {

    public static void main(String[] args) {

        Email email = new Email("dry@gmail.com", "gerente@baxinho.com", "Spring Boot");
        Email email2 = new Email("dry@gmail.com", "comercial@colmeia.com", "Spring Boot");

        Email[] arrayEmail = {email, email2};
        CheckEmail checkEmail;

        for(Email mail: arrayEmail) {
            String[] emailValidado = mail.getDestino().split("@");
            if(emailValidado[1].equals("colmeia.com")) {
                checkEmail = new Gerente()
                        .setProximoDestinatario(new Comercial()
                                .setProximoDestinatario(new Tecnico()));
            } else {
                checkEmail = new Tecnico();
            }
            checkEmail.processarEmail(mail, emailValidado[0]);
        }
    }
}
