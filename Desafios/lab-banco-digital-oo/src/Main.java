/**
 * Classe principal para testar as operações bancárias.
 */
public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Teste");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente Teste 1");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(50, poupanca);

//        Teste de saque valor excedente
//        cc.sacar(500);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        ((ContaPoupanca) poupanca).aplicarRendimento(0.01);
        poupanca.imprimirExtrato();

        banco.listarContas();
    }
}
