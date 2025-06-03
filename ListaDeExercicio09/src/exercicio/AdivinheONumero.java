package exercicio;

import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; 
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 10!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite != numeroSecreto) {
                System.out.println("Errado! Tente novamente.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou. O número era " + numeroSecreto + ".");

        sc.close();
    }
}