
package br.com.guiji.dao.jpa;

import br.com.guiji.dao.generic.jpa.IGenericJapDAO;
import br.com.guiji.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
