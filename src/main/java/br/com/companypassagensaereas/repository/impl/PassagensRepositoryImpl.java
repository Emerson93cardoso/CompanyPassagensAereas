package br.com.companypassagensaereas.repository.impl;

import br.com.companypassagensaereas.domain.ListaWrapper;
import br.com.companypassagensaereas.domain.PassagensAereas;
import br.com.companypassagensaereas.repository.PassagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class PassagensRepositoryImpl implements PassagensRepository {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${services.passagensAereas.salvar}")
    private String urlPassagensService;

    @Value("${services.passagensAereas.listar}")
    private String urlPassagensLista;

    @Override
    public void salvarPassagem(PassagensAereas passagensAereas) {
        restTemplate.postForEntity(urlPassagensService, passagensAereas, String.class);
    }

    @Override
    public List<PassagensAereas> listarPassagens() {
       ListaWrapper listaWrapper = restTemplate.getForEntity(
               urlPassagensLista, ListaWrapper.class).getBody();

       return listaWrapper.getPassagensAereas();
    }
}
