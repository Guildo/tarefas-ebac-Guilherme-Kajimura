/**
 * 
 */
package br.com.guiji.service;

import java.util.List;

import br.com.guiji.domain.Produto;
import br.com.guiji.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
