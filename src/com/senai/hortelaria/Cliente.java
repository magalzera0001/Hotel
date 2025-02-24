package com.senai.hortelaria;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;


    public Cliente(String cpf,String nome, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }
}