package br.com.guiji.dao.produto;

import br.com.guiji.dao.jdbc.ConnectionFactory;
import br.com.guiji.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO (ID, CODIGO, NOME, DESCRICAO, VALOR) VALUES (NEXTVAL('SQ_PRODUTO'),?,?,?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            stm.setString(2, produto.getNome());
            stm.setString(3, produto.getDescricao());
            stm.setBigDecimal(4, produto.getValor());

            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE TB_PRODUTO SET NOME = ?, DESCRICAO = ?, VALOR = ? WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getDescricao());
            stm.setBigDecimal(3, produto.getValor());
            stm.setString(4, produto.getCodigo());

            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Produto buscar(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs;
        Produto produto = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO WHERE codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigo);
            rs = stm.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("ID"));
                produto.setCodigo(rs.getString("CODIGO"));
                produto.setNome(rs.getString("NOME"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setValor(rs.getBigDecimal("VALOR"));
            }
            return produto;
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs;
        List<Produto> listaProduto = new ArrayList<>();
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto prod = new Produto();
                prod.setId(rs.getLong("ID"));
                prod.setCodigo(rs.getString("CODIGO"));
                prod.setNome(rs.getString("NOME"));
                prod.setDescricao(rs.getString("DESCRICAO"));
                prod.setValor(rs.getBigDecimal("VALOR"));
                listaProduto.add(prod);
            }
            return listaProduto;
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
