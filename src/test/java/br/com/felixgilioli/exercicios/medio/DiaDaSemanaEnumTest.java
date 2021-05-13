package br.com.felixgilioli.exercicios.medio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class DiaDaSemanaEnumTest {

    @Test
    void getEnumPelaDescricao_test01() {
        final DiaDaSemanaEnum diaDaSemana = DiaDaSemanaEnum.getEnumPelaDescricao(null);
        assertNull(diaDaSemana);
    }

    @Test
    void getEnumPelaDescricao_test02() {
        final DiaDaSemanaEnum diaDaSemana = DiaDaSemanaEnum.getEnumPelaDescricao("");
        assertNull(diaDaSemana);
    }

    @Test
    void getEnumPelaDescricao_test03() {
        final DiaDaSemanaEnum diaDaSemana = DiaDaSemanaEnum.getEnumPelaDescricao("   ");
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
