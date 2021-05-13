package br.com.felixgilioli.exercicios.facil;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve verificar caso a string {@param s} tenha passado do tamanho {@param tamanho},
     * caso tenha passado, deve-se quebra-la com base no {@param tamanho} passado.
     * Também deve adicionar um reticências no final da string.
     * Exemplo de entrada: s="Felix Gilioli", tamanho=5.
     * Exemplo de saída: "Felix...".
     * obs: caso o tamanho seja maior doque o tamanho da string, deve-se retornar a própria string.
     * @param s string a ser truncada.
     * @param tamanho tamanho máximo da string.
     * @return string truncada.
     */
    public static String getStringTruncada(String s, int tamanho) {
        return null;
    }

    /**
     * Deve verificar se a senha é nula, vazia ou que não esteja preenchida apenas com espaços em branco.
     * ex: s=null, "", "  "
     * @param s string a ser verificada.
     * @return true se a string estiver em branco.
     */
    public static boolean isBlank(String s) {
        return false;
    }

}
