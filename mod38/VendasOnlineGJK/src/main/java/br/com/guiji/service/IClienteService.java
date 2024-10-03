/**
 * 
 */
package br.com.guiji.service;

import java.util.List;

import br.com.guiji.domain.Cliente;
import br.com.guiji.exceptions.DAOException;
import br.com.guiji.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
