package br.com.felixgilioli.exercicios.medio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class DiaDaSemanaEnumTest {

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "   "})
    void getEnumPelaDescricao_test01(String input) {
        final DiaDaSemanaEnum diaDaSemana = DiaDaSemanaEnum.getEnumPelaDescricao(input);
        assertNull(diaDaSemana);
    }

    @Test
    void getEnumPelaDescricao_test04() {
        for (DiaDaSemanaEnum diaDaSemana : DiaDaSemanaEnum.values()) {
            final DiaDaSemanaEnum diaDaSemanaTeste = DiaDaSemanaEnum.getEnumPelaDescricao(diaDaSemana.getDescricao());
            assertEquals(diaDaSemana, diaDaSemanaTeste);
        }
    }

}