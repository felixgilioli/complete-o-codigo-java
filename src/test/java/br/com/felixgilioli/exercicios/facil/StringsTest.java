package br.com.felixgilioli.exercicios.facil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringsTest {

    @Test
    void getStringTruncada_test01() {
        String stringTruncada = Strings.getStringTruncada("Felix Gilioli", 5);
        assertEquals("Felix...", stringTruncada);
    }

    @Test
    void getStringTruncada_test02() {
        String stringTruncada = Strings.getStringTruncada("Felix Gilioli", 50);
        assertEquals("Felix Gilioli", stringTruncada);
    }

    @Test
    void getStringTruncada_test03() {
        String stringTruncada = Strings.getStringTruncada("", 0);
        assertEquals("", stringTruncada);
    }

    @Test
    void getStringTruncada_test04() {
        String stringTruncada = Strings.getStringTruncada("Felix", 0);
        assertEquals("...", stringTruncada);
    }

    @Test
    void getStringTruncada_test05() {
        String stringTruncada = Strings.getStringTruncada(null, 0);
        assertNull(stringTruncada);
    }

    @Test
    void getStringTruncada_test06() {
        String stringTruncada = Strings.getStringTruncada("Felix", -1);
        assertEquals("Felix", stringTruncada);
    }

    @Test
    void isBlank_test01() {
        assertTrue(Strings.isBlank(null));
    }

    @Test
    void isBlank_test02() {
        assertTrue(Strings.isBlank(""));
    }

    @Test
    void isBlank_test03() {
        assertTrue(Strings.isBlank("       "));
    }

    @Test
    void isBlank_test04() {
        assertTrue(Strings.isBlank(" "));
    }

    @Test
    void isBlank_test05() {
        assertFalse(Strings.isBlank("Felix"));
    }

}
