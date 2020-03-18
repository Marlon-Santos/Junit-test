package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;


public class AssertTest {
    private Usuario u1 = new Usuario("testSame");
    private Usuario u2 = u1;
    private Usuario u3 = new Usuario("testNotSame");

    @Test
    public void assertTest() {
        Assert.assertTrue("recebe um boolean verdadeiro", true);
        Assert.assertFalse("recebe um boolen false", false);
        Assert.assertEquals("compara se as duas informações inseridas sõa iguais", "marlon", "marlon");
        Assert.assertSame("compara se a instancia do objeto são iguais", u1, u2);
        Assert.assertNotNull("verefica se a informação inserida é nula", u1);
        //todos os metodos tambem possuim a negação dele, apenas adicionar 'Not' depois do 'assert'
    }
}
