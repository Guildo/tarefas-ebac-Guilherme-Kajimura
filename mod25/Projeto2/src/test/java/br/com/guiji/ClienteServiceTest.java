/**
 * 
 */
package br.com.guiji;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.guiji.dao.ClienteDaoMock;
import br.com.guiji.dao.IClienteDAO;
import br.com.guiji.domain.Cliente;
import br.com.guiji.exceptions.TipoChaveNaoEncontradaException;
import br.com.guiji.services.ClienteService;
import br.com.guiji.services.IClienteService;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Guilherme");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Guilherme Kajimura");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Guilherme Kajimura", cliente.getNome());
	}
}
