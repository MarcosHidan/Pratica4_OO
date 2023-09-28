package br.newtonpaiva.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("<1> Cadastrar Projeto Distribuir Alimentos");
            System.out.println("<2> Cadastrar Projeto Trabalho Voluntário");
            System.out.println("<3> Sair");

            int escolha = scanner.nextInt();

            if (escolha == 3) {
                System.out.println("Encerrando o programa.");
                break;
            }

            scanner.nextLine();

            System.out.print("Nome do Projeto: ");
            String nomeProjeto = scanner.nextLine();
            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();
            System.out.print("Data de Início: ");
            String dataInicio = scanner.nextLine();
            System.out.print("Data de Fim (deixe em branco se não houver data de fim): ");
            String dataFim = scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Descrição do Alimento: ");
                String descAlimento = scanner.nextLine();
                System.out.print("Quantidade: ");
                int qtde = scanner.nextInt();
                DistribuicaoAlimento projeto = new DistribuicaoAlimento(nomeProjeto, descricao, dataInicio, dataFim, descAlimento, qtde);
                if (projeto.validaProjeto()) {
                    System.out.println("\nProjeto Distribuição de Alimentos cadastrado com sucesso!");
                    System.out.println(projeto.imprimeProjeto());
                } else {
                    System.out.println("\nErro: Projeto Distribuição de Alimentos não válido.");
                }
            } else if (escolha == 2) {
                System.out.print("Tipo de Trabalho: ");
                String tipoTrabalho = scanner.nextLine();
                System.out.print("Duração do Trabalho (em horas): ");
                int duracaoTrabalho = scanner.nextInt();
                TrabalhoVoluntario projeto = new TrabalhoVoluntario(nomeProjeto, descricao, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);
                if (projeto.validaProjeto()) {
                    System.out.println("\nProjeto Trabalho Voluntário cadastrado com sucesso!");
                    System.out.println(projeto.imprimeProjeto());
                } else {
                    System.out.println("\nErro: Projeto Trabalho Voluntário não válido.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}