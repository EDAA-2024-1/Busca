/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaBinaria {

    public static int buscar(int[] lista, int alvo) {
        int esquerda = 0, direita = lista.length - 1, meio;

        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;

            if (lista[meio] == alvo) {
                return meio; // alvo encontrado
            }

            if (lista[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // alvo não encontrado
    }

}
