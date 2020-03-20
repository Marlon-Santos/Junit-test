package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.builders.LocacaoBuilder;
import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.utils.DataUtils;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public void test() {
        try {
            Assert.assertTrue(DataUtils.isMesmaData(LocacaoBuilder.locate().locacao().getDataLocacao(), new Date()));
            Assert.assertTrue(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1), LocacaoBuilder.locate().locacao().getDataRetorno()));
            MatcherAssert.assertThat(LocacaoBuilder.locate().locacao().getValor(), CoreMatchers.equalTo(27.5));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}