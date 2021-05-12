package br.com.felixgilioli.exercicios.facil;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BigDecimalsTest {

    @Test
    void getValorComBaseNoPercentual_test01() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("1000"), BigDecimal.TEN);
        assertEquals(0, valor.compareTo(new BigDecimal("100")));
    }

    @Test
    void getValorComBaseNoPercentual_test02() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("20"), new BigDecimal("100"));
        assertEquals(0, valor.compareTo(new BigDecimal("20")));
    }

    @Test
    void getValorComBaseNoPercentual_test03() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("20"), new BigDecimal("500"));
        assertEquals(0, valor.compareTo(new BigDecimal("100")));
    }

    @Test
    void getValorComBaseNoPercentual_test04() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("0"), new BigDecimal("100"));
        assertEquals(0, valor.compareTo(new BigDecimal("0")));
    }

    @Test
    void getValorComBaseNoPercentual_test05() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("100"), new BigDecimal("0"));
        assertEquals(0, valor.compareTo(new BigDecimal("0")));
    }

    @Test
    void getValorComBaseNoPercentual_test06() {
        BigDecimal valor = BigDecimals.getValorComBaseNoPercentual(new BigDecimal("-100"), BigDecimal.TEN);
        assertEquals(0, valor.compareTo(new BigDecimal("-10")));
    }

}