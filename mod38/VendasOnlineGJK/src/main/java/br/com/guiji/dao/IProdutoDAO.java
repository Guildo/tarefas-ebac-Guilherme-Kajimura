/**
 * 
 */
package br.com.guiji.dao;

import java.util.List;

import br.com.guiji.dao.generic.IGenericDAO;
import br.com.guiji.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
