package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Usuario;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MatcherAssertTest {
    private Usuario u1 = new Usuario("testSame");
    private Usuario u2 = u1;
    private Usuario u3 = new Usuario("testNotSame");

    @Test
    public void assertTest() {
        MatcherAssert.assertThat("compara se as duas informações inseridas sõa iguais", "marlon", equalTo("marlon"));
        MatcherAssert.assertThat("compara se a instancia do objeto são iguais", u1, equalTo(u2));
        MatcherAssert.assertThat("verefica se a informação inserida é nula", u1,notNullValue());
        //usar MatcherAssert do hamcrest, assertThat do jUnit foi removido
    }
}
