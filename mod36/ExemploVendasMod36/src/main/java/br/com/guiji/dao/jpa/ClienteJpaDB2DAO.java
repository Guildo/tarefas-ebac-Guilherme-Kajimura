
package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.guiji.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
