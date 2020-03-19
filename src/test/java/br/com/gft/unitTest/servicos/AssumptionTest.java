package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.utils.DataUtils;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class AssumptionTest {
    @Test
    public void assumpTest() {
        try {
            Assume.assumeTrue(DataUtils.verificarDiaSemana(new Date(),Calendar.SATURDAY));
            LocacaoService locacaoService = new LocacaoService();
            Usuario u1 = new Usuario("malon ergon dos santos");
            Filme f1 = new Filme("Avangers", 10, 10.00);
            Filme f2 = new Filme("Spider-man", 10, 10.00);
            Filme f3 = new Filme("Avangers ultimato", 10, 10.00);
            Locacao l1 = locacaoService.alugarFilme(u1, Arrays.asList(f1, f2, f3));
            boolean isMonday = DataUtils.verificarDiaSemana(l1.getDataRetorno(), Calendar.MONDAY);
            Assert.assertTrue(isMonday);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
