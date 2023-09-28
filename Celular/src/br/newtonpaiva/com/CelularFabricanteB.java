package br.newtonpaiva.com;

public class CelularFabricanteB extends CelularComum {
    private boolean usarRadio;

    public CelularFabricanteB() {
        super(5200.00);
        usarRadio = true; // O Fabricante B possui rádio
    }

    public boolean usarRadio() {
        return usarRadio;
    }

    @Override
    public boolean usarTv() {
        return false; // O Fabricante B não possui TV
    }

    @Override
    public boolean usarCamera() {
        return false;
    }

    @Override
    public boolean usarFoneDeOuvido() {
        return false;
    }

    @Override
    public boolean controlarVolume() {
        return false;
    }

    public void setUsarRadio(boolean b) {
    }
}