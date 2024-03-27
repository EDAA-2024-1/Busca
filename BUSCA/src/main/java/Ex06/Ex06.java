/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pense em um número de 1 a 100 e eu tentarei adivinhá-lo.");

        int esquerda = 1, direita = 100, tentativas = 0;
        boolean acertou = false;

        while (esquerda <= direita && !acertou) {
            int meio = (esquerda + direita) / 2;
            System.out.println("Eu acho que o seu número é: " + meio);
            System.out.println("Seu número é 'alto', 'baixo', ou 'correto'?");
            String resposta = scanner.nextLine().trim().toLowerCase();
            tentativas++;

            switch (resposta) {
                case "correto" -> {
                    acertou = true;
                    System.out.println("Uau! Eu adivinhei o seu número em " + tentativas + " tentativas.");
                }
                case "alto" -> direita = meio - 1;
                case "baixo" -> esquerda = meio + 1;
                default -> {
                    System.out.println("Não entendi. Por favor, responda com 'alto', 'baixo', ou 'correto'.");
                    tentativas--; // não conta como tentativa válida
                }
            }
        }

        if (!acertou) {
            System.out.println("Parece que houve algum engano. Vamos tentar novamente mais tarde.");
        }

    }

}
