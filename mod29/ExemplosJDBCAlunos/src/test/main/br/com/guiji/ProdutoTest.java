package br.com.guiji;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import br.com.guiji.dao.produto.IProdutoDAO;
import br.com.guiji.dao.produto.ProdutoDAO;
import br.com.guiji.domain.Produto;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Galaxy S23");
        produto.setDescricao("SmartPhone da Samsung");
        produto.setValor(BigDecimal.valueOf(2900.30));

        Integer qtd = dao.cadastrar(produto);
        assertEquals(1, (int) qtd);

        Produto produtoBD = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getDescricao(), produtoBD.getDescricao());
        assertEquals(produto.getValor(), produtoBD.getValor());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void atualizarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Galaxy S23");
        produto.setDescricao("SmartPhone da Samsung");
        produto.setValor(BigDecimal.valueOf(2900.30));

        Integer qtd = dao.cadastrar(produto);
        assertEquals(1, (int) qtd);

        Produto produtoBD = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getDescricao(), produtoBD.getDescricao());
        assertEquals(produto.getValor(), produtoBD.getValor());

        produtoBD.setNome("Iphone 15 Pro Max");
        produtoBD.setDescricao("SmartPhone da Apple");
        produtoBD.setValor(BigDecimal.valueOf(10000.10));

        Integer qtdAtualizado = dao.atualizar(produtoBD);
        assertEquals(1, (int) qtdAtualizado);

        Produto produtoBD2 = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD2);
        assertNotNull(produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getDescricao(), produtoBD2.getDescricao());
        assertEquals(produtoBD.getValor(), produtoBD2.getValor());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);

        Integer qtdDel2 = dao.excluir(produtoBD2);
        assertNotNull(qtdDel2);
    }

    @Test
    public void buscarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Galaxy S23");
        produto.setDescricao("SmartPhone da Samsung");
        produto.setValor(BigDecimal.valueOf(2607.33));

        Produto produto2 = new Produto();
        produto2.setCodigo("02");
        produto2.setNome("Iphone 15");
        produto2.setDescricao("SmartPhone da Apple");
        produto2.setValor(BigDecimal.valueOf(5500.90));

        Integer qtd = dao.cadastrar(produto);
        Integer qtd2 = dao.cadastrar(produto2);
        assertEquals(1, (int) qtd);
        assertEquals(1, (int) qtd2);

        Produto produtoBD = dao.buscar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Produto produtoBD2 = dao.buscar(produto2.getCodigo());
        assertNotNull(produtoBD2);
        assertNotNull(produtoBD2.getId());
        assertEquals(produto2.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produto2.getNome(), produtoBD2.getNome());

        Integer qtdDel = dao.excluir(produtoBD2);
        assertNotNull(qtdDel);

        Integer qtdDel2 = dao.excluir(produtoBD2);
        assertNotNull(qtdDel2);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Galaxy S23");
        produto.setDescricao("SmartPhone da Samsung");
        produto.setValor(BigDecimal.valueOf(2607.33));

        Produto produto2 = new Produto();
        produto2.setCodigo("02");
        produto2.setNome("Iphone 15");
        produto2.setDescricao("SmartPhone da Apple");
        produto2.setValor(BigDecimal.valueOf(5500.90));

        Integer qtd = dao.cadastrar(produto);
        assertEquals(1, (int) qtd);
        Integer qtd2 = dao.cadastrar(produto2);
        assertEquals(1, (int) qtd2);

        List<Produto> list = dao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        for (Produto prod : list) {
            dao.excluir(prod);
        }

        assertEquals(0, dao.buscarTodos().size());
    }

    @Test
    public void excluirTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Galaxy S23");
        produto.setDescricao("SmartPhone da Samsung");
        produto.setValor(BigDecimal.valueOf(2607.33));

        Integer qtd = dao.cadastrar(produto);
        assertEquals(1, (int) qtd);

        Produto produtoBD = dao.buscar(produto.getCodigo());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }
}
