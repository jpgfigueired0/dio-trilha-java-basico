package poo.desafio.classes.impl;

import poo.desafio.interfaces.Telefone;

public class TelefoneImpl implements Telefone {
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void recusarChamada() {
        System.out.println("Recusando chamada.");
    }

    @Override
    public void favoritos() {
        System.out.println("Acessando favoritos.");
    }

    @Override
    public void recentes() {
        System.out.println("Acessando recentes.");
    }

    @Override
    public void listaContato() {
        System.out.println("Acessando lista de contatos.");
    }

    @Override
    public void tecladoDiscagem() {
        System.out.println("Acessando teclado de discagem.");
    }

    @Override
    public void correioVoz() {
        System.out.println("Acessando correio de voz.");
    }
}
