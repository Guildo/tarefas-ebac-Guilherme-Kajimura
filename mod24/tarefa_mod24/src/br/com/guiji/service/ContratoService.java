package br.com.guiji.service;

import br.com.guiji.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String alterar() {
        contratoDao.alterar();
        return "Alterado com Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca bem sucedida";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluído com Sucesso";
    }
}
