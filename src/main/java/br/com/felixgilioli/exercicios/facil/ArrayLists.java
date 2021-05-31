package br.com.felixgilioli.exercicios.facil;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe com métodos para trabalhar com listas do tipo {@link java.util.ArrayList}.
 */
public class ArrayLists {

    private ArrayLists() {}

    /**
     * Deve filtrar os elementos de {@param numeros} e retornar apenas os números que são impares.
     * @param numeros lista de inteiros.
     * @return lista de inteiros apenas com números impares.
     */
    public static List<Integer> getImpares(List<Integer> numeros) {
        return numeros;
    }

    /**
     * Deve retornar a quantidade de pessoas que começam com a letra {@param letra}
     * @param pessoas lista contendo o nome das pessoas, ex: ["Felix", "Daiane"].
     * @param letra letra na qual deve você retornar a quantidade dos nomes que começam com ela, ex: "F"
     * @return quantidade de pessoas.
     */
    public static long getQuantidadeDePessoasQueComecamComALetra(List<String> pessoas, String letra) {
        return 0;
    }

    /**
     * Deve fazer a leitura de um valor inteiro.{@param valorEntrada}
     * Em seguida, calcule o menor número de notas possíveis(cédulas) onde o valor pode ser decomposto.
     * As notas que você deve considerar são de 100,50,20,10,5,2,1.
     * Na sequencia insira na ordem respetiva a demonstrada acima numa Lista de retorno a quantidade de cada cédula encontrada no calculo.
     *
     * @param valorEntrada Você receberá um valor inteiro N (0 < N < 1000000).
     * @return lista com a quantidade de cédulas encontradas para cada valor.
     */
    public static List<Integer> getMenorQuantidadeDeCedulasPossivelParaInteiro(int valorEntrada) {
        List<Integer> quantidadeDeCedulas = new ArrayList<>();

        // Montagem da Lista
        /*
        quantidadeDeCedulas.add(cedulas100);
        quantidadeDeCedulas.add(cedulas50);
        quantidadeDeCedulas.add(cedulas20);
        quantidadeDeCedulas.add(cedulas10);
        quantidadeDeCedulas.add(cedulas5);
        quantidadeDeCedulas.add(cedulas2);
        quantidadeDeCedulas.add(cedulas1);
        */

        return quantidadeDeCedulas;
    }

    /**
     * Deve retornar a mesma lista de nomes recebida {@param pessoas}, mas ordenada
     * alfabéticamente em ordem crescente
     * @param pessoas
     * @return
     */
    public static List<String> getPessoasOrdenadasAlfabeticamenteCrescente(List<String> pessoas) { return null; }

    /**
     * Deve retornar a mesma lista de nomes recebida {@param pessoas}, mas ordenada
     * alfabéticamente em ordem decrescente
     * @param pessoas
     * @return
     */
    public static List<String> getPessoasOrdenadasAlfabeticamenteDecrescente(List<String> pessoas) { return null; }


}
