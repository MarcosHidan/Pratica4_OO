package br.newtonpaiva.com;

public class ContaCorrente implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}