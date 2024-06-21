package poo.desafio.classes.impl;

import poo.desafio.interfaces.Calendario;

public class CalendarioImpl implements Calendario {
    @Override
    public void verEventos() {
        System.out.println("Visualizando eventos.");
    }

    @Override
    public void adicionarEvento() {
        System.out.println("Adicionando evento.");
    }
}
