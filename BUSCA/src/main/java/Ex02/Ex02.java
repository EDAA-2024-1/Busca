/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado um vetor Onde temos um objeto Pessoa com as propriedades nome e idade.
        Encontre nessa lista qual pessoa tem a idade de 100 anos.
        Escreva o nome dela no console.
        Encontre as pessoas que tem idade superior a 30 anos. 
        Escreva os devidos nomes no console.*/
        Scanner input = new Scanner(System.in);
        int idade, opcao;
        ArrayList<Pessoa> pessoasEncontradas = new ArrayList<>();

        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);

        Pessoa[] listaPessoas = {vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda};

        do {
            System.out.println("\n:::::::::::::Menu de Opções:::::::::::");
            System.out.println("""
                               [1] Buscar a primeira pessoa com uma determinada idade
                               [2] Buscar todas as pessoas com idade superior a uma determinada
                               [3] Sair
                               """);
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe a idade que deseja buscar: ");
                    idade = input.nextInt();
                    Pessoa p = BuscaPessoa.encontrarPorIdade(listaPessoas, idade);
                    System.out.println(p != null ? "Pessoa com " + idade + " anos:" + p.getNome() : "Nenhuma pessoa com " + idade + " anos encontrada.");
                }
                case 2 -> {
                    System.out.println("Informe a idade mínima: ");
                    idade = input.nextInt();
                    pessoasEncontradas = BuscaPessoa.encontrarMaiorQueIdade(listaPessoas, idade);
                    System.out.println(!pessoasEncontradas.isEmpty() ? "Pessoas com mais de " + idade + " anos: " + pessoasEncontradas.toString() : "Nenhuma pessoa com mais de " + idade + " anos encontrada.");
                }
                case 3 ->
                    System.out.println("Até logo!");
                default ->
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

    }

}
