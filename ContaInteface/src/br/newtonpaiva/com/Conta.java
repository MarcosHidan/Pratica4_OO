package br.newtonpaiva.com;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}