package br.newtonpaiva.com;

public abstract class CelularComum implements Celular {
    private boolean enviarMensagem;
    private boolean acessarInternet;
    private boolean verificarEmails;
    private boolean verificarSistemaArquivos;
    private double preco;

    public CelularComum(double preco) {
        this.preco = preco;
    }

    @Override
    public void ligar() {
        System.out.println("Celular ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Celular desligado");
    }

    @Override
    public boolean enviarMensagem() {
        return enviarMensagem;
    }

    @Override
    public boolean acessarInternet() {
        return acessarInternet;
    }

    @Override
    public boolean verificarEmails() {
        return verificarEmails;
    }

    @Override
    public boolean verificarSistemaArquivos() {
        return verificarSistemaArquivos;
    }

    public double getPreco() {
        return preco;
    }

    public abstract boolean usarTv();

    public abstract boolean usarRadio();
}