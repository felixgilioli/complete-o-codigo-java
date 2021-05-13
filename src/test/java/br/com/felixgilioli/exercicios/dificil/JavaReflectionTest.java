package br.com.felixgilioli.exercicios.dificil;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.felixgilioli.exercicios.objetos.Endereco;
import br.com.felixgilioli.exercicios.objetos.Usuario;

class JavaReflectionTest {

    @Test
    void getNomeDosAtributosDoObjeto_test01() {
        final List<String> nomeDosAtributosDoUsuario = JavaReflection.getNomeDosAtributosDoObjeto(new Usuario());
        assertEquals(asList("dataNascimento", "nome", "sobrenome"), nomeDosAtributosDoUsuario);
    }

    @Test
    void getNomeDosAtributosDoObjeto_test02() {
        final List<String> nomeDosAtributosDoEndereco = JavaReflection.getNomeDosAtributosDoObjeto(new Endereco());
        assertEquals(asList("cep", "cidade", "complemento", "estado", "numero", "pais", "rua"), nomeDosAtributosDoEndereco);
    }

    @Test
    void getNomeDosAtributosDoObjeto_test03() {
        final List<String> nomeDosAtributosDoObjeto = JavaReflection.getNomeDosAtributosDoObjeto(new Object());
        assertTrue(nomeDosAtributosDoObjeto.isEmpty());
    }

    @Test
    void getNomeDosAtributosDoObjeto_test04() {
        final List<String> nomeDosAtributosDoObjeto = JavaReflection.getNomeDosAtributosDoObjeto(null);
        assertTrue(nomeDosAtributosDoObjeto.isEmpty());
    }

}
