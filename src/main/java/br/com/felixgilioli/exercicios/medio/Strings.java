package br.com.felixgilioli.exercicios.medio;

import java.util.stream.Stream;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve retornar a quantidade de letras maiúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras maiúsculas.
     */
    public static int getQuantidadeLetrasMaiusculas(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        return (int) Stream.of(str.split(""))
                .map(letraStr -> letraStr.charAt(0))
                .filter(Character::isUpperCase)
                .count();
    }

    /**
     * Deve retornar a quantidade de letras minúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras minúsculas.
     */
    public static int getQuantidadeLetrasMinusculas(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        return (int) Stream.of(str.split(""))
                .map(letraStr -> letraStr.charAt(0))
                .filter(Character::isLowerCase)
                .count();
    }

    /**
     * Deve retornar a quantidade de caracteres especiais(*, #, @, !, etc) que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de caracteres especiais.
     */
    public static int getQuantidadeCaracteresEspeciais(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        return (int) Stream.of(str.replaceAll("\\s+", "").split("\\s*"))
                .filter(letra -> letra.matches("[^a-zA-Z0-9_]"))
                .count();
    }

}
