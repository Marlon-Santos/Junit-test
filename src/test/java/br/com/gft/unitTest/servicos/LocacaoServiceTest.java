package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public void test() {
        try {
            LocacaoService locacaoService = new LocacaoService();
            Usuario u1 = new Usuario("malon ergon dos santos");
            Filme f1 = new Filme("Avangers", 10, 10.00);
            Filme f2 = new Filme("Spider-man", 10, 10.00);
            Filme f3 = new Filme("Avangers ultimato", 10, 10.00);
            Locacao l1 = locacaoService.alugarFilme(null, Arrays.asList(f1,f2,f3));
            Assert.assertTrue(DataUtils.isMesmaData(l1.getDataLocacao(), new Date()));
            Assert.assertTrue(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1), l1.getDataRetorno()));
            Assert.assertTrue(l1.getValor() == 10);
        }catch (Exception e){
             e.getStackTrace();
        }
    }
}