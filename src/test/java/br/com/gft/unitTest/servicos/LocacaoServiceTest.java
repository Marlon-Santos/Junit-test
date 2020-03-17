package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public void test() {
        LocacaoService locacaoService = new LocacaoService();
        Usuario u1 = new Usuario("malon ergon dos santos");
        Filme f1 = new Filme("Avangers", 10, 10.00);
        Locacao l1 = locacaoService.alugarFilme(u1, f1);
        Assert.assertTrue(DataUtils.isMesmaData(l1.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1), l1.getDataRetorno()));
        Assert.assertTrue(l1.getValor() == 10);
    }
}