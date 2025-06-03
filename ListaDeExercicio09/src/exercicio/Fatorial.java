package exercicio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            int contador = 1;

            do {
                fatorial *= contador;
                contador++;
            } while (contador <= numero);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();
    }
}