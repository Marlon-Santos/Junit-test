package br.com.gft.unitTest.servicos;

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

public class DiscountTest {
    public static LocacaoService locacaoService = new LocacaoService();

    @Test
    public void firstDiscount() {
        try {
            Usuario u1 = new Usuario("malon ergon dos santos");
            Filme f1 = new Filme("Avangers", 10, 10.00);
            Filme f2 = new Filme("Spider-man", 10, 10.00);
            Filme f3 = new Filme("Avangers r", 10, 10.00);
            Filme f4 = new Filme("Avangers ulrrtimato", 10, 10.00);
            Filme f5 = new Filme("Avangers ultirrrrmato", 10, 10.00);
            Filme f6 = new Filme("Avangers ultimatorrrrrr", 10, 10.00);
            Filme f7 = new Filme("Avangers ultimatorrrrrr", 10, 10.00);
            Locacao l1 = locacaoService.alugarFilme(u1, Arrays.asList(f1, f2, f3, f4, f5, f6, f7));
            MatcherAssert.assertThat(l1.getValor(), CoreMatchers.equalTo(10 * 0.75 + 10 * 0.25 + 10 * 0.50 + 20 + 10));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
