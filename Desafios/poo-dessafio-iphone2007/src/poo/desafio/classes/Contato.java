package poo.desafio.classes;

import java.util.List;

public class Contato {
    private String nome;
    private List<String> telefones;
    private String email;
    private String endereco;

    public Contato(String nome, List<String> telefones, String email, String endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.email = email;
        this.endereco = endereco;
    }

    public void salvar() {
        System.out.println("Contato salvo.");
    }

    public void cancelar() {
        System.out.println("Operação cancelada.");
    }

    public void editar() {
        System.out.println("Contato editado.");
    }

    public void excluir() {
        System.out.println("Contato excluído.");
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
