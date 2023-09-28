package br.newtonpaiva.com;

public class GeradorExtratos {
    public static void gerarExtrato(Conta conta) {
        System.out.println("Extrato da Conta");
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}