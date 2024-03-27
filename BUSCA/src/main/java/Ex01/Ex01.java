/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Crie um algoritmo de busca sequencial para encontrar o índice do número 77. Qual o seu índice?
            Encontre agora o índice do número 600. Qual o seu índice?
            Encontre agora o índice do número 56. Qual o seu índice?
            Encontre agora o índice do número 65. Qual o seu índice?
            Agora encontre todos os índices onde o número 65 se encontra. Imprima esses índices na tela.*/

        Scanner input = new Scanner(System.in);
        int[] listaNumeros = {40, 63, 40, 36, 10, 89, 74, 32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52, 25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19, 33, 21, 57, 19, 55, 93, 31, 54, 31, 50, 66, 44, 54, 55, 29, 75, 43, 88, 61, 65, 49, 87, 10, 25, 33, 70, 84, 125, 345, 400, 77, 32, 41, 66, 33, 70, 84, 125, 600, 38, 43, 51, 34, 76, 25, 48, 14, 50, 71, 1, 98, 86, 38, 91, 65, 96, 60, 43, 75, 86, 59, 17, 86, 12, 10, 16, 10, 33, 15, 77, 22, 56, 4, 9, 63, 49, 80, 39, 53, 97, 36, 34, 16, 1, 98, 78, 92, 100, 35};
        int indice, numero, opcao;
        ArrayList<Integer> indices;

        do {
            System.out.println("\n:::::::::::::Menu de Opções:::::::::::");
            System.out.println("""
                               [1] Buscar primeira ocorrência
                               [2] Buscar todas as ocorrências
                               [3] Sair
                               """);
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o número que deseja buscar: ");
                    numero = input.nextInt();

                    indice = BuscaSequencial.buscar(listaNumeros, numero);
                    System.out.println(indice != -1 ? "Índice do número " + numero + ": " + indice : "Número " + numero + " não encontrado.");
                }
                case 2 -> {
                    System.out.println("Informe o número que deseja buscar: ");
                    numero = input.nextInt();
                    indices = BuscaSequencial.buscarTodos(listaNumeros, numero);
                    System.out.println(!indices.isEmpty() ? "Índices do número " + numero + ": " + Arrays.toString(indices.toArray()) : "Número " + numero + " não encontrado.");
                }
                case 3 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        
    }
}
