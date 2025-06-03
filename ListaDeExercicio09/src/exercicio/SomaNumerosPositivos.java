package exercicio;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("A soma dos números positivos é: " + soma);

        sc.close();
    }
}