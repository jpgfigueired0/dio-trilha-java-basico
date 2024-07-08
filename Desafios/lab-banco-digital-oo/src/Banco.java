import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    //métodos para gerenciar contas, como adicionar, remover, buscar contas, buscar por cliente e listar todas contas
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    public Conta buscarConta(int numero) {
        return this.contas.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public Optional<Conta> buscarPorCliente(String nomeCliente) {
        return this.contas.stream()
                .filter(conta -> conta.getCliente().getNome().equals(nomeCliente))
                .findFirst();
    }

    public void listarContas() {
        this.contas.forEach(conta -> {
            System.out.println("Cliente" + conta.getCliente().getNome() + " | Conta: " + conta.getNumero());
        });
    }
}