/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    private static String imprimirLivros(List<Livro> livros, List<Integer> indices) {
        StringBuilder sb = new StringBuilder();
        for (Integer indice : indices) {
            sb.append(livros.get(indice).toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int opcao;
        Scanner input = new Scanner(System.in);
        List<Integer> resultado;
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Algoritmos e Estruturas de Dados: Teoria e Prática", "Bruno Preiss", 2000));
        livros.add(new Livro("Estruturas de Dados Descomplicadas em Linguagem C", "André Backes", 2017));
        livros.add(new Livro("Estruturas de Dados e Algoritmos em C++", "Michael T. Goodrich", 2011));
        livros.add(new Livro("Estruturas de Dados e Algoritmos em Java", "Michael T. Goodrich", 2014));
        do {
            System.out.println("\n:::::::::::::Biblioteca:::::::::::");
            System.out.println("""
                               [1] Buscar por título
                               [2] Buscar por autor
                               [3] Buscar por ano de publicação
                               [4] Sair
                               """);
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> {
                    // Ordena por título
                    Collections.sort(livros, Comparator.comparing(Livro::getTitulo));
                    System.out.println("Informe o título do livro que deseja buscar: ");
                    String titulo = input.nextLine();

                    // Busca binária por título
                    resultado = BuscaBinaria.buscaTodos(livros, titulo, Livro::getTitulo);
                    System.out.println(!resultado.isEmpty() ? "Livros encontrados nas posições: " + resultado.toString() + "\n" + imprimirLivros(livros, resultado) : "Nenhum livro encontrado com o título "+ titulo +".");

                }
                case 2 -> {
                    // Ordena por autor
                    Collections.sort(livros, Comparator.comparing(Livro::getAutor));
                    System.out.println("Informe o nome do autor do livro que deseja buscar: ");
                    String autor = input.nextLine();

                    // Busca binária por autor
                    resultado = BuscaBinaria.buscaTodos(livros, autor, Livro::getAutor);
                    System.out.println(!resultado.isEmpty() ? "Livros encontrados nas posições: " + resultado.toString() + "\n" + imprimirLivros(livros, resultado) : "Nenhum livro encontrado do autor "+ autor +".");

                }
                case 3 -> {
                    // Ordena por ano de publicação
                    Collections.sort(livros, Comparator.comparing(Livro::getAnoDePublicacao));
                    System.out.println("Informe o ano do livro que deseja buscar: ");
                    int ano = input.nextInt();

                    // Busca binária por ano de publicação
                    resultado = BuscaBinaria.buscaTodos(livros, ano, Livro::getAnoDePublicacao);
                    System.out.println(!resultado.isEmpty() ? "Livros encontrados nas posições: " + resultado.toString() + "\n" + imprimirLivros(livros, resultado) : "Nenhum livro encontrado para o ano "+ ano +".");

                }
                case 4 ->
                    System.out.println("Até logo!");
                default ->
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

    }
}
