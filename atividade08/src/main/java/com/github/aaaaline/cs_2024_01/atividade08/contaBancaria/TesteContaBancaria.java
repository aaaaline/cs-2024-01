package com.github.aaaaline.cs_2024_01.atividade08.contaBancaria;

import java.util.Scanner;

public class TesteContaBancaria {

    public static void main (String[] args) {
        int opcao = 0;
        double valorSaque, valorDeposito, saldoAtual = 0.0;

        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria(0.00);

        while (opcao != 3) {
            try {
                System.out.println("Escolha a operação que deseja executar: ");
                System.out.println("\t1 - Depósito;");
                System.out.println("\t2 - Saque;");
                System.out.print("\t3 - Sair;\n\n");

                opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser depositado: ");
                        valorDeposito = scanner.nextDouble();
                        saldoAtual = contaBancaria.depositar(valorDeposito);

                        System.out.println("Saldo atual: " + saldoAtual);
                        break;

                    case 2:
                        System.out.print("Digite o valor do saque: ");
                        valorSaque = scanner.nextDouble();
                        saldoAtual = contaBancaria.sacar(valorSaque);

                        System.out.println("Saldo atual: " + saldoAtual);
                        break;

                    case 3:
                        System.out.println("Encerrando o programa.")

                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }
            catch (SaldoInsuficienteException e) {
                System.out.println("Erro ao executar operação! " + e.getMessage());
            }
        }
    }
}