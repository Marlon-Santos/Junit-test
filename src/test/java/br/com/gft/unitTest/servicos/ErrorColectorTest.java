package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Usuario;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class ErrorColectorTest {
    private Usuario u1 = new Usuario("testSame");
    private Usuario u2 = u1;
    private Usuario u3 = new Usuario("testNotSame");

    @Rule
    public ErrorCollector error = new ErrorCollector();
    @Test
    public void assertTest() {
        error.checkThat("compara se as duas informações inseridas sõa iguais", "marlon", equalTo("marlon"));
        error.checkThat("compara se a instancia do objeto são iguais", u1, equalTo(u2));
        error.checkThat("verefica se a informação inserida é nula", u1,notNullValue());
        //usar MatcherAssert do hamcrest, assertThat do jUnit foi removido, link ref https://github.com/junit-team/junit4/wiki/Assertions
    }
}
