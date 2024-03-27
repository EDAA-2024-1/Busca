/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Você está desenvolvendo um aplicativo para monitorar a variação de 
        preços de um produto específico ao longo do tempo. Os produtos estão 
        armazenados em um array ordenado por data. Encontre a primeira e a 
        última ocorrência de um preço específico para determinar o período em
        que ele permaneceu inalterado. Utilize uma busca binária.
         */
        Scanner input = new Scanner(System.in);
        double precoProcurado;
        int primeiraOcorrencia, ultimaOcorrencia;

        Produto[] produtos = {
            new Produto("2024-01-01", 10.0),
            new Produto("2024-01-02", 15.0),
            new Produto("2024-01-03", 15.0),
            new Produto("2024-01-04", 20.0)
        };
        System.out.println("Informe o preço que deseja buscar: ");
        precoProcurado = input.nextDouble();

        primeiraOcorrencia = BuscaBinaria.buscaPrimeiraOcorrencia(produtos, precoProcurado);
        ultimaOcorrencia = BuscaBinaria.buscaUltimaOcorrencia(produtos, precoProcurado);

        System.out.println("Primeira ocorrência do preço " + precoProcurado + ": " + (primeiraOcorrencia != -1 ? produtos[primeiraOcorrencia] : "não encontrado"));
        System.out.println("Última ocorrência do preço " + precoProcurado + ": " + (ultimaOcorrencia != -1 ? produtos[ultimaOcorrencia] : "não encontrado"));
    }

}
