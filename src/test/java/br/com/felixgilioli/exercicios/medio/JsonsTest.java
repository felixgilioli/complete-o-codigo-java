package br.com.felixgilioli.exercicios.medio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.felixgilioli.exercicios.objetos.Endereco;
import br.com.felixgilioli.exercicios.objetos.Usuario;

class JsonsTest {

    @Test
    void toGson_test01() {
        final var usuario = new Usuario("Felix", "Gilioli", null);
        final String json = Jsons.toGson(usuario);
        assertEquals("{\"nome\":\"Felix\",\"sobrenome\":\"Gilioli\"}", json);
    }

    @Test
    void toGson_test02() {
        try {
            Jsons.toGson(null);
            fail();
        } catch (Exception e) {
            if (!(e instanceof NullPointerException)) {
                fail();
            }

            assertEquals("obj é obrigatório.", e.getMessage());
        }
    }


    @Test
    void toGson_test03() {
        final var endereco = new Endereco();
        endereco.setCep("82720410");
        endereco.setCidade("Curitiba");
        endereco.setEstado("Paraná");
        endereco.setComplemento("Ap 13 bloco 3");
        endereco.setNumero("931");
        endereco.setRua("Paulo Kulik");
        endereco.setPais("Brasil");

        final String json = Jsons.toGson(endereco);
        assertEquals("{\"pais\":\"Brasil\","
                             + "\"estado\":\"Paraná\","
                             + "\"cidade\":\"Curitiba\","
                             + "\"rua\":\"Paulo Kulik\","
                             + "\"numero\":\"931\","
                             + "\"complemento\":\"Ap 13 bloco 3\","
                             + "\"cep\":\"82720410\"}", json);
    }
}