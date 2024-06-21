package poo.desafio.classes;

import poo.desafio.classes.impl.*;
import poo.desafio.interfaces.*;

public class iOS {
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private SMS sms;
    private Galeria galeria;
    private Calendario calendario;
    private Email email;
    private Browser browser;

    public iOS() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.telefone = new TelefoneImpl();
        this.sms = new SMSImpl();
        this.galeria = new GaleriaImpl();
        this.calendario = new CalendarioImpl();
        this.email = new EmailImpl();
        this.browser = new BrowserImpl();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public SMS getSms() {
        return sms;
    }

    public Galeria getGaleria() {
        return galeria;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public Email getEmail() {
        return email;
    }

    public Browser getBrowser() {
        return browser;
    }
}
