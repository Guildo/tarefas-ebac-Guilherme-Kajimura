package br.com.guiji;

import static org.junit.Assert.assertNotNull;

import br.com.guiji.dao.*;
import br.com.guiji.domain.Acessorio;
import br.com.guiji.domain.Carro;
import br.com.guiji.domain.Marca;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessorioDao acessorioDao;

    public CarroTest() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("M1");
        Acessorio acessorio1 = criarAcessorio("A1");
        Acessorio acessorio2 = criarAcessorio("A2");

        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(acessorio1);
        acessorios.add(acessorio2);

        Carro carro = new Carro();
        carro.setCodigo("C1");
        carro.setNome("CARRO 001");
        carro.setMarca(marca);
        carro.setAcessorios(acessorios);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("MARCA 001");
        return marcaDao.cadastrar(marca);
    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setNome("Acessório " + codigo);
        return acessorioDao.cadastrar(acessorio);
    }
}
