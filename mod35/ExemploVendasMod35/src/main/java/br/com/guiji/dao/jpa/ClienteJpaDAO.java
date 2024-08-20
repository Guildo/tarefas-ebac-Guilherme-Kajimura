package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.GenericJpaDAO;
import br.com.guiji.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
