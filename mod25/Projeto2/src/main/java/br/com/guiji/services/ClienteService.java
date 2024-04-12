package br.com.guiji.services;

import br.com.guiji.dao.IClienteDAO;
import br.com.guiji.domain.Cliente;
import br.com.guiji.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}
