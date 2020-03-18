package br.com.gft.unitTest.servicos;

import java.util.Date;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.exceptions.LocacaoServiceException;
import br.com.gft.unitTest.utils.DataUtils;

public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme) throws LocacaoServiceException {
        if (filme == null){
            throw new LocacaoServiceException("sem filme");
        }if (filme.getEstoque() <= 0){
            throw new LocacaoServiceException("sem estoque");
        }if (usuario == null){
            throw new LocacaoServiceException("sem cadastro");
        }
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = DataUtils.adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return locacao;
    }
}