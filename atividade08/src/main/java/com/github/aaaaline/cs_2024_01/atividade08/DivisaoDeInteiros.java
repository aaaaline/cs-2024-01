package com.github.aaaaline.cs_2024_01.atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoDeInteiros {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro para o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite um número inteiro para o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;

            System.out.println(numerador + " / " + denominador + " = " + resultado);
        }
        catch (ArithmeticException e) {
            System.out.println("O denominador não pode ser zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("O valor digitado é inválido!");
        }
    }
}
