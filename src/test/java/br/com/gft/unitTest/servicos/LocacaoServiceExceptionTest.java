package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.exceptions.LocacaoServiceException;
import br.com.gft.unitTest.utils.DataUtils;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceExceptionTest {
    @Test
    public void exceptionTest(){
        try {
            LocacaoService locacaoService = new LocacaoService();
            Usuario u1 = new Usuario("malon ergon dos santos");
            Filme f1 = new Filme("Avangers", 10, 10.00);
            Locacao l1 = locacaoService.alugarFilme(null, f1);
            Assert.assertTrue(DataUtils.isMesmaData(l1.getDataLocacao(), new Date()));
            Assert.assertTrue(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1), l1.getDataRetorno()));
            Assert.assertTrue(l1.getValor() == 10);
            Assert.fail();
        }catch (LocacaoServiceException e){
            MatcherAssert.assertThat(e.getMessage(), CoreMatchers.equalTo("sem cadastro"));
        }
    }
}
