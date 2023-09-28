package br.newtonpaiva.com;

public class Main {
    public static void main(String[] args) {
        CelularFabricanteA celularA = new CelularFabricanteA();
        celularA.setUsarTv(false);

        CelularFabricanteB celularB = new CelularFabricanteB();
        celularB.setUsarRadio(false);

        System.out.println("Celular Fabricante A - Preço: R$" + celularA.getPreco());
        System.out.println("Usa TV: " + celularA.usarTv());
        System.out.println("Usa Rádio: " + celularA.usarRadio());

        System.out.println("\nCelular Fabricante B - Preço: R$" + celularB.getPreco());
        System.out.println("Usa TV: " + celularB.usarTv());
        System.out.println("Usa Rádio: " + celularB.usarRadio());
    }
}