/**
 * 
 */
package br.com.guiji.dao;

import java.util.List;

import br.com.guiji.dao.generic.IGenericDAO;
import br.com.guiji.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
