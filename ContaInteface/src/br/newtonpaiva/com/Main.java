package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000);
        contaCorrente.sacar(500);
        GeradorExtratos.gerarExtrato(contaCorrente);

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(2000);
        contaPoupanca.sacar(300);
        GeradorExtratos.gerarExtrato(contaPoupanca);
    }
}