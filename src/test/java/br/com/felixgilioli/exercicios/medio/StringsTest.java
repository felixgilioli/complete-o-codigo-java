package br.com.felixgilioli.exercicios.medio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringsTest {

    @Test
    void getQuantidadeLetrasMaiusculas_test01() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("Felix");
        assertEquals(1, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test02() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("Felix Gilioli");
        assertEquals(2, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test03() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("testandoOTesteDoTestador");
        assertEquals(4, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test04() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("");
        assertEquals(0, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test05() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("FELIX");
        assertEquals(5, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test06() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas(null);
        assertEquals(0, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMaiusculas_test07() {
        int quantidadeLetrasMaiusculas = Strings.getQuantidadeLetrasMaiusculas("felix");
        assertEquals(0, quantidadeLetrasMaiusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test01() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("Felix");
        assertEquals(4, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test02() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("Felix Gilioli");
        assertEquals(10, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test03() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("testandoOTesteDoTestador");
        assertEquals(20, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test04() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("");
        assertEquals(0, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test05() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("FELIX");
        assertEquals(0, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test06() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas(null);
        assertEquals(0, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeLetrasMinusculas_test07() {
        int quantidadeLetrasMinusculas = Strings.getQuantidadeLetrasMinusculas("felix");
        assertEquals(5, quantidadeLetrasMinusculas);
    }

    @Test
    void getQuantidadeCaracteresEspeciais_test01() {
        int quantidadeCaracteresEspeciais = Strings.getQuantidadeCaracteresEspeciais("Felix");
        assertEquals(0, quantidadeCaracteresEspeciais);
    }

    @Test
    void getQuantidadeCaracteresEspeciais_test02() {
        int quantidadeCaracteresEspeciais = Strings.getQuantidadeCaracteresEspeciais("teste@felixgilioli.com.br");
        assertEquals(3, quantidadeCaracteresEspeciais);
    }

    @Test
    void getQuantidadeCaracteresEspeciais_test03() {
        int quantidadeCaracteresEspeciais = Strings.getQuantidadeCaracteresEspeciais("");
        assertEquals(0, quantidadeCaracteresEspeciais);
    }

    @Test
    void getQuantidadeCaracteresEspeciais_test04() {
        int quantidadeCaracteresEspeciais = Strings.getQuantidadeCaracteresEspeciais(null);
        assertEquals(0, quantidadeCaracteresEspeciais);
    }

    @Test
    void getQuantidadeCaracteresEspeciais_test05() {
        int quantidadeCaracteresEspeciais = Strings.getQuantidadeCaracteresEspeciais("!@#)(");
        assertEquals(5, quantidadeCaracteresEspeciais);
    }
}
