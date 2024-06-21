package poo.desafio.classes;

public abstract class Dispositivo {
    private String modelo;
    private String fabricante;

    public Dispositivo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    public void ligarDispositivo() {
        System.out.println("O dispositivo está ligando.");
    }

    public void desligarDispositivo() {
        System.out.println("O dispositivo está desligando.");
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }
}
