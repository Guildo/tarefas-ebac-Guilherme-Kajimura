
package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.guiji.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
