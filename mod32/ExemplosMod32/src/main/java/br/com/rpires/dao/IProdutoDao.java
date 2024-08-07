package br.com.rpires.dao;

import br.com.rpires.domain.Produto;
import java.util.List;

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto prod);

    public List<Produto> buscarTodos();

}
