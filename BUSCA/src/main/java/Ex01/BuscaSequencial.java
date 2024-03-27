/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaSequencial {

    public static int buscar(int[] lista, int alvo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == alvo) {
                return i; // retorna o índice da primeira ocorrência
            }
        }
        return -1; // não encontrado
    }

    public static ArrayList<Integer> buscarTodos(int[] lista, int alvo) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == alvo) {
                indices.add(i);
            }
        }
        return indices;
    }
}

