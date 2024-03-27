/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaPessoa {

    public static Pessoa encontrarPorIdade(Pessoa[] lista, int idade) {
        Pessoa encontrada = new Pessoa();
        for (Pessoa pessoa : lista) {
            if (pessoa.getIdade() == idade) {
                return pessoa;
            }
        }
        return encontrada;
    }

    public static ArrayList<Pessoa> encontrarMaiorQueIdade(Pessoa[] lista, int idade) {
        ArrayList<Pessoa> pessoas30 = new ArrayList<>();
        for (Pessoa pessoa : lista) {
            if (pessoa.getIdade() > idade) {
                pessoas30.add(pessoa);
            }
        }
        return pessoas30;
    }
}
