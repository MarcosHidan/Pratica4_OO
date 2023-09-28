package br.newtonpaiva.com;

public class CelularFabricanteA extends CelularComum {
    private boolean usarTv;

    public CelularFabricanteA() {
        super(6800.00);
        usarTv = true; // O Fabricante A possui TV
    }

    public boolean usarTv() {
        return usarTv;
    }

    @Override
    public boolean usarRadio() {
        return false; // O Fabricante A não possui rádio
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

    public void setUsarTv(boolean b) {
    }
}