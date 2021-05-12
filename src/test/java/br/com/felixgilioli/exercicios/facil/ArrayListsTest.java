package br.com.felixgilioli.exercicios.facil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayListsTest {

    @Test
    void getImpares_test01() {
        List<Integer> numeros = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> impares = ArrayLists.getImpares(numeros);
        assertEquals(asList(1, 3, 5, 7, 9), impares);
    }

    @Test
    void getImpares_test02() {
        List<Integer> numeros = new ArrayList<>(asList(2, 4, 6, 8, 10));
        List<Integer> impares = ArrayLists.getImpares(numeros);
        assertTrue(impares.isEmpty());
    }

    @Test
    void getImpares_test03() {
        List<Integer> numeros = new ArrayList<>(asList(1, 3, 5));
        List<Integer> impares = ArrayLists.getImpares(numeros);
        assertEquals(asList(1, 3, 5), impares);
    }

    @Test
    void getImpares_test04() {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> impares = ArrayLists.getImpares(numeros);
        assertTrue(impares.isEmpty());
    }

    @Test
    void getQuantidadeDePessoasQueComecamComALetra_test01() {
        List<String> pessoas = new ArrayList<>(asList("Felix", "Daiane", "Erivelto",
                "Paulo", "Maycon", "Elizandro"));
        long quantidade = ArrayLists.getQuantidadeDePessoasQueComecamComALetra(pessoas, "E");

        assertEquals(2, quantidade);
    }

    @Test
    void getQuantidadeDePessoasQueComecamComALetra_test02() {
        List<String> pessoas = new ArrayList<>(asList("Felix", "Daiane", "Erivelto",
                "Paulo", "Maycon", "Elizandro"));
        long quantidade = ArrayLists.getQuantidadeDePessoasQueComecamComALetra(pessoas, "A");

        assertEquals(0, quantidade);
    }

    @Test
    void getQuantidadeDePessoasQueComecamComALetra_test03() {
        List<String> pessoas = new ArrayList<>();
        long quantidade = ArrayLists.getQuantidadeDePessoasQueComecamComALetra(pessoas, "A");

        assertEquals(0, quantidade);
    }

    @Test
    void getQuantidadeDePessoasQueComecamComALetra_test04() {
        List<String> pessoas = new ArrayList<>(asList("Felix"));
        long quantidade = ArrayLists.getQuantidadeDePessoasQueComecamComALetra(pessoas, "F");

        assertEquals(1, quantidade);
    }
}