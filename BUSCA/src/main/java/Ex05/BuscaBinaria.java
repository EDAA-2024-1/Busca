/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex05;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaBinaria {

    public static int buscaPrimeiraOcorrencia(Produto[] produtos, double preco) {
        int esquerda = 0, direita = produtos.length - 1, meio, resultado = -1;
        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (preco == produtos[meio].getPreco()) {
                resultado = meio; // encontrado, continua buscando à esquerda
                direita = meio - 1;
            } else if (preco < produtos[meio].getPreco()) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }
        return resultado;
    }

    public static int buscaUltimaOcorrencia(Produto[] produtos, double preco) {
        int esquerda = 0, direita = produtos.length - 1, meio, resultado = -1;
        while (esquerda <= direita) {
            meio = esquerda + (direita - esquerda) / 2;
            if (preco == produtos[meio].getPreco()) {
                resultado = meio; // encontrado, continua buscando à direita
                esquerda = meio + 1;
            } else if (preco < produtos[meio].getPreco()) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }
        return resultado;
    }
}
