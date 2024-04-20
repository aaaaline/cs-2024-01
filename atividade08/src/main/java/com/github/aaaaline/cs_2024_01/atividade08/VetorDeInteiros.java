package com.github.aaaaline.cs_2024_01.atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorDeInteiros {

    public static void main(String[] args) {
        int i = 0, j;
        int numero;
        int[] vetorDeInteiros = new int[10];

        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.print("Digite um número inteiro (0 para parar): ");
                numero = scanner.nextInt();

                vetorDeInteiros[i] = numero;
                i++;
            } while (numero != 0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("O tamanho máximo do vetor foi ultrapassado!");
        }
        catch (InputMismatchException e) {
            System.out.println("O valor digitado é inválido!");
        }
        finally {
            System.out.print("Os elementos do vetor são: ");
            for (j = 0; j < i; j++) {
                System.out.print(vetorDeInteiros[j] + " ");
            }
        }
    }
}