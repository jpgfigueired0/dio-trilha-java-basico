package poo.desafio.classes;

public class iPhone extends Dispositivo{
    private iOS sistemaOperacional;

    public iPhone(String modelo, String fabricante) {
        super(modelo, fabricante);
        this.sistemaOperacional = new iOS();
    }

    public void home() {
        System.out.println("Acessando a tela inicial.");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume.");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume.");
    }

    public void camera() {
        System.out.println("Acessando a câmera.");
    }

    public void entradaFoneOuvido() {
        System.out.println("Conectando fone de ouvido.");
    }

    public void entradaChip() {
        System.out.println("Inserindo chip.");
    }

    public void botaoPower() {
        System.out.println("Botão power pressionado.");
    }

    public void altoFalante() {
        System.out.println("Usando alto-falante.");
    }

    public void microfone() {
        System.out.println("Usando microfone.");
    }

    public void conectorBateria() {
        System.out.println("Conectando bateria.");
    }

    public void sensorProximidade() {
        System.out.println("Usando sensor de proximidade.");
    }

    public iOS getSistemaOperacional() {
        return sistemaOperacional;
    }
}
