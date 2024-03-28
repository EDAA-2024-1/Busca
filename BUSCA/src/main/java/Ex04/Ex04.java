/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        int indice;
        Livro[] livros = {
            new Livro("Algoritmos e Estruturas de Dados: Teoria e Prática", "Bruno Preiss", 2000),
            new Livro("Estruturas de Dados Descomplicadas em Linguagem C", "André Backes", 2017),
            new Livro("Estruturas de Dados e Algoritmos em C++", "Michael T. Goodrich", 2011),
            new Livro("Estruturas de Dados e Algoritmos em Java", "Michael T. Goodrich", 2014),};

        System.out.println("Informe o titulo do livro que deseja buscar: ");
        String titulo = input.nextLine();
        
        indice = BuscaBinaria.buscar(livros, titulo);
        System.out.println(indice != -1 ? "Livro encontrado na posição: " + indice + "\n"+livros[indice].toString(): "Livro não encontrado.");

    }

}
