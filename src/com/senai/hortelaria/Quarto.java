package com.senai.hortelaria;

public class Quarto {
    private int numero;
    private String tipo;
    private boolean ocupado;

    public Quarto(String tipo, int numero, boolean ocupado){
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }
    public void ocuparQuarto() {
        this.ocupado = true;
    }
    public void desocuparQuarto() {
        this.ocupado = false;
    }
    public void exibirInformacoes(){
        System.out.println("Quarto: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ocupado: " + this.ocupado);

    }
}