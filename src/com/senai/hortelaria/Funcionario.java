package com.senai.hortelaria;

public class Funcionario {
    private String nome;
    private int cargo;

    public Funcionario(String nome, int cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
    }
}