package br.com.guiji.dao;

import br.com.guiji.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.guiji.dao.jpa.IVendaJpaDAO;
import br.com.guiji.domain.jpa.VendaJpa;
import br.com.guiji.exceptions.DAOException;
import br.com.guiji.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author guilherme.kajimura
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
