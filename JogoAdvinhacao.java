package jogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int tentativas = 5;
        int tentativasUsadas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("O algoritmo gerou um número entre 0 e 100.");
        System.out.println("Você tem até " + tentativas + " tentativas para adivinhar o número.\n");


        while (tentativasUsadas < tentativas) {
            System.out.println("Digite um número (Tentativa " + (tentativasUsadas + 1) + " de " + tentativas + "): ");

            if (scanner.hasNextInt()) {
                int numeroDigitado = scanner.nextInt();


                if (numeroDigitado < numeroAleatorio) {
                    System.out.println("O número gerado é maior que " + numeroDigitado + ". Tente novamente!");
                } else if (numeroDigitado > numeroAleatorio) {
                    System.out.println("O número gerado é menor que " + numeroDigitado + ". Tente novamente!");
                } else {

                    System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
                    break;
                }

                tentativasUsadas++;
            } else {

                System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
                scanner.next();
            }
        }


        if (tentativasUsadas == tentativas) {
            System.out.println("\nVocê usou todas as suas tentativas. O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
