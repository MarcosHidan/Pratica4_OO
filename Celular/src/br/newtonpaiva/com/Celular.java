package br.newtonpaiva.com;

public interface Celular {
    void ligar();
    void desligar();
    boolean usarCamera();
    boolean usarFoneDeOuvido();
    boolean controlarVolume();
    boolean enviarMensagem();
    boolean acessarInternet();
    boolean verificarEmails();
    boolean verificarSistemaArquivos();
}