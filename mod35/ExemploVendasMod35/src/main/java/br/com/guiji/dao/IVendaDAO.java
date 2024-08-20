package br.com.guiji.dao;

import br.com.guiji.dao.generic.IGenericDAO;
import br.com.guiji.domain.Venda;
import br.com.guiji.exceptions.DAOException;
import br.com.guiji.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
