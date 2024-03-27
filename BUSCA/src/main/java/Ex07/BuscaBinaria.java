/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author rafaelamoreira
 */
public class BuscaBinaria {

    public static <T> int buscaIndice(List<Livro> livros, T chave, Function<Livro, T> extrator) {

        int esq = 0, dir = livros.size() - 1, meio, compara;
        Livro valorMeio;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            valorMeio = livros.get(meio);
            compara = ((Comparable<T>) extrator.apply(valorMeio)).compareTo(chave);

            if (compara == 0) {
                return meio; // Chave encontrada

            } else if (compara < 0) {
                esq = meio + 1;
            } else {
                dir = meio - 1;

            }
        }
        return -1; // Chave não encontrada
    }

    public static <T> List<Integer> buscaTodos(List<Livro> livros, T chave, Function<Livro, T> extrator) {
        int indiceInicial, indicePrimeiraOcorrencia, indiceAtual;
        List<Integer> indices = new ArrayList<>();

        indiceInicial = buscaIndice(livros, chave, extrator);

        if (indiceInicial < 0) { // se não encontrou, retorna lista vazia
            return indices;
        }

        // Encontrar a primeira ocorrência no intervalo
        indicePrimeiraOcorrencia = indiceInicial;
        while (indicePrimeiraOcorrencia > 0 && extrator.apply(livros.get(indicePrimeiraOcorrencia - 1)).equals(chave)) {
            indicePrimeiraOcorrencia--;
        }

        // Adicionar todas as ocorrências subsequentes, incluindo a primeira encontrada
        indiceAtual = indicePrimeiraOcorrencia;
        while (indiceAtual < livros.size() && extrator.apply(livros.get(indiceAtual)).equals(chave)) {
            indices.add(indiceAtual);
            indiceAtual++;
        }

        return indices;
    }
}
