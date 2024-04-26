package br.com.guiji;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.guiji.dao.cliente.ClienteDAO;
import br.com.guiji.dao.cliente.IClienteDAO;
import br.com.guiji.domain.Cliente;

import java.util.List;

public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Jin Kajimura");
		
		Integer qtd = dao.cadastrar(cliente);
        assertEquals(1, (int) qtd);
		
		Cliente clienteBD = dao.buscar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Jin Kajimura");

		Integer qtd = dao.cadastrar(cliente);
		assertEquals(1, (int) qtd);

		Cliente clienteBD = dao.buscar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		clienteBD.setCodigo("01");
		clienteBD.setNome("Marcelo Jun Kawasaki");

		Integer qtdAtualizado = dao.atualizar(clienteBD);
		assertEquals(1, (int) qtdAtualizado);

		Cliente clienteBD2 = dao.buscar(cliente.getCodigo());
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getId(), clienteBD2.getId());
		assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
		assertEquals(clienteBD.getNome(), clienteBD2.getNome());

		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);

		Integer qtdDel2 = dao.excluir(clienteBD2);
		assertNotNull(qtdDel2);
	}

	@Test
	public void buscarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Jin Kajimura");

		Cliente cliente2 = new Cliente();
		cliente2.setCodigo("02");
		cliente2.setNome("Tamires Ayumi Morishigue");

		Integer qtd = dao.cadastrar(cliente);
		Integer qtd2 = dao.cadastrar(cliente2);
		assertEquals(1, (int) qtd);
		assertEquals(1, (int) qtd2);

		Cliente clienteBD = dao.buscar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		Cliente clienteBD2 = dao.buscar(cliente2.getCodigo());
		assertNotNull(clienteBD2);
		assertNotNull(clienteBD2.getId());
		assertEquals(cliente2.getCodigo(), clienteBD2.getCodigo());
		assertEquals(cliente2.getNome(), clienteBD2.getNome());

		Integer qtdDel = dao.excluir(clienteBD2);
		assertNotNull(qtdDel);

		Integer qtdDel2 = dao.excluir(clienteBD2);
		assertNotNull(qtdDel2);
	}

	@Test
	public void buscarTodosTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Jin Kajimura");

		Cliente cliente2 = new Cliente();
		cliente2.setCodigo("02");
		cliente2.setNome("Tamires Ayumi Morishigue");

		Integer qtd = dao.cadastrar(cliente);
		assertEquals(1, (int) qtd);
		Integer qtd2 = dao.cadastrar(cliente2);
		assertEquals(1, (int) qtd2);

		List<Cliente> list = dao.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());

		for (Cliente cli : list) {
			dao.excluir(cli);
		}

		assertEquals(0, dao.buscarTodos().size());
	}

	@Test
	public void excluirTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Jin Kajimura");

		Integer qtd = dao.cadastrar(cliente);
		assertEquals(1, (int) qtd);

		Cliente clienteBD = dao.buscar(cliente.getCodigo());

		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
}
