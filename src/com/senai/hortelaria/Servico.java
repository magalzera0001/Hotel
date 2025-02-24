package com.senai.hortelaria;

public class Servico {
    private String descricao;
    private int custo;

    public Servico(String descricao, int custo) {
        this.descricao = descricao;
        this.custo = custo;
    }
    public void exibirInformacoes(){
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Custo: " + this.custo);
    }
}
