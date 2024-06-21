package poo.desafio.classes.impl;

import poo.desafio.interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocedendo música.");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando música.");
    }

    @Override
    public void fullscreen() {
        System.out.println("Tela cheia ativada.");
    }

    @Override
    public void listarAlbum() {
        System.out.println("Listando álbuns.");
    }

    @Override
    public void listarMusicas() {
        System.out.println("Listando músicas.");
    }
}
