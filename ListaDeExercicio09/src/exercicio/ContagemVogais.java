package exercicio;

import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        do {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            palavra = sc.nextLine();

            if (!palavra.equalsIgnoreCase("sair")) {
                int contadorVogais = contarVogais(palavra);
                System.out.println("A palavra '" + palavra + "' possui " + contadorVogais + " vogal(is).");
            }

        } while (!palavra.equalsIgnoreCase("sair"));

        System.out.println("Programa encerrado.");
        sc.close();
    }

    public static int contarVogais(String palavra) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }
}