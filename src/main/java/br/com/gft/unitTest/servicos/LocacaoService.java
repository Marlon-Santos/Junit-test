package br.com.gft.unitTest.servicos;

import java.util.Date;

import br.com.gft.unitTest.entidades.Filme;
import br.com.gft.unitTest.entidades.Locacao;
import br.com.gft.unitTest.entidades.Usuario;
import br.com.gft.unitTest.utils.DataUtils;

public class LocacaoService {
	
	public  Locacao alugarFilme(Usuario usuario, Filme filme) {
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

	public static void main(String[] args) {
		LocacaoService locacaoService = new LocacaoService();
		Usuario u1 = new Usuario("malon ergon dos santos");
		Filme f1 = new Filme("Avangers",10,10.00);
		Locacao l1 = locacaoService.alugarFilme(u1,f1);
		System.out.println(DataUtils.isMesmaData(l1.getDataLocacao(),new Date()));
		System.out.println(DataUtils.isMesmaData(DataUtils.obterDataComDiferencaDias(1),l1.getDataRetorno()));
		System.out.println(l1.getValor() == 10);
	}
}