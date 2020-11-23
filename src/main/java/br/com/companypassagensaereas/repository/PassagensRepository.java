package br.com.companypassagensaereas.repository;

import br.com.companypassagensaereas.domain.PassagensAereas;

import java.util.List;

public interface PassagensRepository {

    void salvarPassagem(PassagensAereas passagensAereas);
    List<PassagensAereas> listarPassagens();
}
