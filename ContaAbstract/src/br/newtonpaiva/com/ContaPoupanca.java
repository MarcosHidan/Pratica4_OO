package br.newtonpaiva.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        System.out.println("Extrato da Conta Poupança");
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Data e Hora: " + sdf.format(data));
    }
}