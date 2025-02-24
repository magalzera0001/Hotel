package com.senai.hortelaria;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private int dataInicio;
    private int dataFim;

    public Reserva(String Cliente, int Quarto,  int dataInicio, int dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;


    }
    public void ExibirInformacoes(){
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Data de inicio: " + this.dataInicio);
        System.out.println("Data de fim: " + this.dataFim);

    }
}