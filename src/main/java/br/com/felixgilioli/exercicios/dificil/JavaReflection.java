package br.com.felixgilioli.exercicios.dificil;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Classe com exercícios sobre java reflection.
 */
public class JavaReflection {

    private JavaReflection() {}

    /**
     * Deve retornar o nome dos atributos do objeto {@param objeto}.
     * obs: os nomes devem ser retornados em ordem alfabetica.
     * @return lista com nome dos atributos.
     */
    public static List<String> getNomeDosAtributosDoObjeto(Object objeto) {
        if (objeto == null) {
            return Collections.emptyList();
        }

        return Stream.of(objeto.getClass().getDeclaredFields())
                .map(Field::getName)
                .sorted()
                .collect(Collectors.toList());
    }

}
