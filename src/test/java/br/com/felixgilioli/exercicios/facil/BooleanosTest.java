package br.com.felixgilioli.exercicios.facil;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BooleanosTest {

    @Test
    void falseIfNull_test01() {
        assertFalse(Booleanos.falseIfNull(null));
    }

    @Test
    void falseIfNull_test02() {
        assertFalse(Booleanos.falseIfNull(Boolean.FALSE));
    }

    @Test
    void falseIfNull_test03() {
        assertTrue(Booleanos.falseIfNull(Boolean.TRUE));
    }

}
