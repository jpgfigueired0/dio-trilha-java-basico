package poo.desafio.classes.impl;

import poo.desafio.interfaces.Email;

public class EmailImpl implements Email {
    @Override
    public void enviarEmail() {
        System.out.println("Enviando email.");
    }

    @Override
    public void receberEmail() {
        System.out.println("Recebendo email.");
    }
}
