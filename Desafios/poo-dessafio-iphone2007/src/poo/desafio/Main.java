package poo.desafio;

import poo.desafio.classes.iOS;
import poo.desafio.classes.iPhone;
import poo.desafio.interfaces.*;

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone X", "Apple");

        // Testando funcionalidades do dispositivo
        meuIPhone.ligarDispositivo();
        meuIPhone.desligarDispositivo();

        // Testando funcionalidades de hardware
        meuIPhone.home();
        meuIPhone.aumentarVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.camera();
        meuIPhone.entradaFoneOuvido();
        meuIPhone.entradaChip();
        meuIPhone.botaoPower();
        meuIPhone.altoFalante();
        meuIPhone.microfone();
        meuIPhone.conectorBateria();
        meuIPhone.sensorProximidade();

        // Testando funcionalidades do sistema operacional iOS
        iOS meuIOS = meuIPhone.getSistemaOperacional();

        // Reprodutor Musical
        ReprodutorMusical reprodutorMusical = meuIOS.getReprodutorMusical();
        reprodutorMusical.play();
        reprodutorMusical.pause();
        reprodutorMusical.retroceder();
        reprodutorMusical.avancar();
        reprodutorMusical.fullscreen();
        reprodutorMusical.listarAlbum();
        reprodutorMusical.listarMusicas();

        // Telefone
        Telefone telefone = meuIOS.getTelefone();
        telefone.fazerChamada("123456789");
        telefone.atenderChamada();
        telefone.recusarChamada();
        telefone.favoritos();
        telefone.recentes();
        telefone.listaContato();
        telefone.tecladoDiscagem();
        telefone.correioVoz();

        // SMS
        SMS sms = meuIOS.getSms();
        sms.novaMensagem();
        sms.homeMensagem();

        // Galeria
        Galeria galeria = meuIOS.getGaleria();
        galeria.verFotos();
        galeria.verVideos();

        // Calendário
        Calendario calendario = meuIOS.getCalendario();
        calendario.verEventos();
        calendario.adicionarEvento();

        // Email
        Email email = meuIOS.getEmail();
        email.enviarEmail();
        email.receberEmail();

        // Browser
        Browser browser = meuIOS.getBrowser();
        browser.exibirPagina("http://www.web.dio.me.com");
        browser.adicionarNovaAba();
        browser.atualizarPagina();
    }
}
