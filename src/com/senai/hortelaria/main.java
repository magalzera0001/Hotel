package com.senai.hortelaria;

import java.time.LocalDate;               // Para trabalhar com datas
import java.time.format.DateTimeFormatter; // Para formatar as datas (dd/MM/yyyy)
import java.time.temporal.ChronoUnit;     // Para calcular a diferença entre datas
import java.util.Scanner;                 // Para entrada do usuário

public class main {                       // Nome da classe deve começar com maiúscula (convenção Java)
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Scanner para entrada de dados pelo usuário

        // Formato esperado para as datas: dd/MM/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Interface do usuario
        System.out.println("------Bem vindo Hotel Estrela--------");

        // ---- Coletando dados do cliente ----
        System.out.println("Digite seu CPF: ");
        String cpf = teclado.next();  // CPF como String para preservar zeros à esquerda

        System.out.println("Digite o número do seu quarto: ");
        int numero = teclado.nextInt();  // Número do quarto como inteiro

        System.out.println("Digite o tipo do quarto: ");
        String tipo = teclado.next();

        teclado.nextLine();  // Consumir a quebra de linha após o next()

        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();  // Entrada do nome completo

        System.out.println("Digite o seu email: ");
        String email = teclado.nextLine(); // Entrada do e-mail

        // ---- Coletando datas de início e fim ----
        System.out.println("Digite a data de início (dd/MM/yyyy): ");
        String dataInicioStr = teclado.nextLine();  // Lê a data como String
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter); // Converte para LocalDate

        System.out.println("Digite a data de fim (dd/MM/yyyy): ");
        String dataFimStr = teclado.nextLine();  // Lê a data de fim como String
        LocalDate dataFim = LocalDate.parse(dataFimStr, formatter); // Converte para LocalDate

        // ---- Calculando a diferença entre as datas ----
        long diasDeEstadia = ChronoUnit.DAYS.between(dataInicio, dataFim);

        // ---- Coletando informações do serviço ----
        System.out.print("Digite a descrição do serviço: ");
        String descricaoServico = teclado.nextLine();

        System.out.print("Digite o custo do serviço: ");
        int custoServico = teclado.nextInt(); // Coleta do custo do serviço




        // ---- Criando objetos ----
        Cliente cliente = new Cliente(cpf, nome, email);  // Instancia um objeto Cliente
        Quarto quarto = new Quarto(tipo, numero, false);  // Instancia um objeto Quarto (ocupado = false)
        Servico servicoHotel = new Servico(descricaoServico, custoServico);  // Instancia um objeto Servico

        // ---- Exibindo as informações ----
        System.out.println("\n--- Informações do Cliente ---");
        cliente.exibirInformacoes();

        System.out.println("\n--- Informações do Quarto ---");
        quarto.exibirInformacoes();

        System.out.println("\n--- Datas da Reserva ---");
        System.out.println("Data de início: " + dataInicio.format(formatter));  // Formata para exibição
        System.out.println("Data de fim: " + dataFim.format(formatter));
        System.out.println("Duração da estadia: " + diasDeEstadia + " dias");   // Mostra quantos dias a pessoa ficará

        System.out.println("\n--- Serviço de Hotel ---");
        servicoHotel.exibirInformacoes();  // Exibe informações do serviço

        // ---- Fechando o Scanner para evitar vazamento de recursos ----
        teclado.close();
    }
}
