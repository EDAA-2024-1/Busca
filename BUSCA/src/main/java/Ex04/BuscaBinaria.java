/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaBinaria {

   public static int buscar(Livro[] array, String chave) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            int compara = array[meio].getTitulo().compareTo(chave);

            if (compara == 0) {
                return meio; // Encontrou
            } else if (compara < 0) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1; // Não encontrou
    }

}
