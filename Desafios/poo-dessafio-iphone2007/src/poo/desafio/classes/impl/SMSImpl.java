package poo.desafio.classes.impl;

import poo.desafio.interfaces.SMS;

public class SMSImpl implements SMS {
    @Override
    public void novaMensagem() {
        System.out.println("Criando nova mensagem.");
    }

    @Override
    public void homeMensagem() {
        System.out.println("Acessando home de mensagens.");
    }
}
