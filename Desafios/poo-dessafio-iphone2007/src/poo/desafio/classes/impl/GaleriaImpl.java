package poo.desafio.classes.impl;

import poo.desafio.interfaces.Galeria;

public class GaleriaImpl implements Galeria {
    @Override
    public void verFotos() {
        System.out.println("Visualizando fotos.");
    }

    @Override
    public void verVideos() {
        System.out.println("Visualizando vídeos.");
    }
}
