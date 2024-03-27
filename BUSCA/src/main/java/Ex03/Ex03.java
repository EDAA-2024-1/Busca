/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado o código:
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        Implemente um algoritmo de busca binária para retornar o índice do 
        número 
        Qual o seu índice? E para o número 81? Qual o seu índice?*/
        int[] listaNumeros = {52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int numero, indice;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número que deseja buscar: ");
        numero = input.nextInt();

        indice = BuscaBinaria.buscar(listaNumeros, numero);
        System.out.println(indice != -1 ? "Índice do número " + numero + ": " + indice : "Número " + numero + " não encontrado.");
               
    }

}
