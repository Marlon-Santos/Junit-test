package br.com.gft.unitTest.builders;

import java.util.Arrays;

import br.com.gft.unitTest.mocks.LocacaoDao;
import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.exceptions.LocacaoServiceException;
import br.com.gft.unitTest.mocks.SPC;
import br.com.gft.unitTest.servicos.LocacaoService;
import org.mockito.Answers;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class LocacaoBuilder {
    private LocacaoService elemento;
    static Locacao locations;

    private LocacaoBuilder() {
    }

    public static LocacaoBuilder locate() throws LocacaoServiceException {
        LocacaoBuilder builder = new LocacaoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public static void inicializarDadosPadroes(LocacaoBuilder builder) throws LocacaoServiceException {
        builder.elemento = new LocacaoService();
        Usuario u1 = new Usuario("malon ergon dos santos");
        Filme f1 = new Filme("Avangers", 10, 10.00);
        Filme f2 = new Filme("Spider-man", 10, 10.00);
        Filme f3 = new Filme("Avangers ultimato", 10, 10.00);
        LocacaoService elemento = builder.elemento;
        SPC spc = Mockito.mock(SPC.class);
        Mockito.when(spc.isNegative(u1)).thenReturn(true);
        elemento.setSpc(spc);
        elemento.setLocacaoDao(Mockito.mock(LocacaoDao.class));

        Locacao l1 = elemento.alugarFilme(u1, Arrays.asList(f1, f2, f3));
        locations = l1;
    }

    public Locacao locacao() {
        return locations;
    }
}