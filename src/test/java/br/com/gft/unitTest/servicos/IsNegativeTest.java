package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.builders.LocacaoBuilder;
import br.com.gft.unitTest.exceptions.LocacaoServiceException;
import br.com.gft.unitTest.utils.DataUtils;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class IsNegativeTest {
    @Test
    public void isNegative() {
        try {
            MatcherAssert.assertThat(LocacaoBuilder.locate().locacao().getDataRetorno(), CoreMatchers.equalTo(DataUtils.obterDataComDiferencaDias(1)));
            Assert.fail();
        } catch (LocacaoServiceException e) {
            MatcherAssert.assertThat(e.getMessage(), CoreMatchers.equalTo("usuario negativado"));
        }
    }
}
