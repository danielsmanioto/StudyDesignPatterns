package com.proxy.cachedao.cachedao;

import com.proxy.cachedao.cachedao.model.Identificavel;

public interface DAO {

    Identificavel recuperar(int id);

    void excluir(int id);

    void salvar(Identificavel obj);

}
