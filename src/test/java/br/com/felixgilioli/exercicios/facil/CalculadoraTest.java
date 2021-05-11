package br.com.felixgilioli.exercicios.facil;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void getMedia_test01() {
        int[] ints = new int[5];
        ints[0] = 10;
        ints[1] = 5;
        ints[2] = 4;
        ints[3] = 7;
        ints[4] = 8;

        double media = Calculadora.getMedia(ints);
        assertEquals(6.8, media);
    }

    @Test
    void getMedia_test02() {
        int[] ints = new int[3];
        ints[0] = 3;
        ints[1] = 3;
        ints[2] = 4;

        double media = Calculadora.getMedia(ints);
        assertEquals(3.333, media, 0.001);
    }

    @Test
    void getMedia_test03() {
        int[] ints = new int[1];
        ints[0] = 4;

        double media = Calculadora.getMedia(ints);
        assertEquals(4, media);
    }

    @Test
    void getMaior_test01() {
        int maior = Calculadora.getMaior(20, 10);
        assertEquals(20, maior);
    }

    @Test
    void getMaior_test02() {
        int maior = Calculadora.getMaior(4, 7);
        assertEquals(7, maior);
    }

    @Test
    void getMaior_test03() {
        int maior = Calculadora.getMaior(10, -20);
        assertEquals(10, maior);
    }

    @Test
    void getMaior_test04() {
        int maior = Calculadora.getMaior(0, 0);
        assertEquals(0, maior);
    }

    @Test
    void getRaizQuadrada_test01() {
        double raizQuadrada = Calculadora.getRaizQuadrada(9);

        assertEquals(3, raizQuadrada);
    }

    @Test
    void getRaizQuadrada_test02() {
        double raizQuadrada = Calculadora.getRaizQuadrada(10);

        assertEquals(3.16, raizQuadrada, 0.01);
    }

    @Test
    void getRaizQuadrada_test03() {
        double raizQuadrada = Calculadora.getRaizQuadrada(0);

        assertEquals(0, raizQuadrada);
    }

    @Test
    void getAbsoluto_test01() {
        int absoluto = Calculadora.getAbsoluto(0);

        assertEquals(0, absoluto);
    }

    @Test
    void getAbsoluto_test02() {
        int absoluto = Calculadora.getAbsoluto(-10);

        assertEquals(10, absoluto);
    }

    @Test
    void getAbsoluto_test03() {
        int absoluto = Calculadora.getAbsoluto(20);

        assertEquals(20, absoluto);
    }

}