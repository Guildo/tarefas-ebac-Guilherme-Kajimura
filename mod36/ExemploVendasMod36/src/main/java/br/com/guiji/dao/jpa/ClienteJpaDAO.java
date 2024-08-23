
package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.guiji.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
