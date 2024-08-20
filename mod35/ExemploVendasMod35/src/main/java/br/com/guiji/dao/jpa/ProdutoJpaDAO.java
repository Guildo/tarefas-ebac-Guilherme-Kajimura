package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.GenericJpaDAO;
import br.com.guiji.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
