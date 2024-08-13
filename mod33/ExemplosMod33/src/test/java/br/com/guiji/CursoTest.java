/**
 * 
 */
package br.com.guiji;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.guiji.dao.CursoDao;
import br.com.guiji.dao.ICursoDao;
import br.com.guiji.domain.Curso;

 
public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
