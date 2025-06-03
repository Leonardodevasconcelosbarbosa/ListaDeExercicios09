package exercicio;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite uma nota entre 0 e 10 (ou outro valor para sair): ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;
            }

        } while (nota >= 0 && nota <= 10);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        sc.close();
    }
}