package br.com.guiji.services;

import br.com.guiji.dao.IProdutoDAO;
import br.com.guiji.domain.Produto;
import br.com.guiji.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
