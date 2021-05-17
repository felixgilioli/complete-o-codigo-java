package br.com.felixgilioli.exercicios.medio;

import java.util.Objects;

import com.google.gson.Gson;

/**
 * Métodos utilitários para trabalhar com JSON.
 */
public class Jsons {

    private Jsons() {}

    /**
     * Deve converter um objeto para json usando a biblioteca {@link com.google.gson.Gson}.
     * @param obj objeto.
     * @throws NullPointerException caso o {@param obj} seja nulo. mensagem retornada deve ser "obj é obrigatório.".
     * @return json.
     */
    public static String toGson(Object obj) {
        Objects.requireNonNull(obj, "obj é obrigatório.");

        return new Gson().toJson(obj);
    }

}
