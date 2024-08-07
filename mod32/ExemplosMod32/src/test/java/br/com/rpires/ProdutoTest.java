package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import br.com.rpires.dao.IProdutoDao;
import br.com.rpires.dao.ProdutoDao;
import br.com.rpires.domain.Produto;
import org.junit.Test;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A001");
        produto.setNome("Produto 001");
        produto.setDescricao("Descrição do Produto 001");
        produto.setValor(10.00);
        produto.setCategoria("Categoria 001");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
    }
}
