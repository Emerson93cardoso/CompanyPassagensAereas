package br.com.companypassagensaereas.services;

import br.com.companypassagensaereas.domain.PassagensAereas;
import br.com.companypassagensaereas.repository.PassagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassagensAereasService {

        @Autowired
        private PassagensRepository passagensRepository;

        public void salvarPassagem(PassagensAereas passagensAereas) {
            passagensRepository.salvarPassagem(passagensAereas);
    }
        public List <PassagensAereas> listarPassagens() {
            return passagensRepository.listarPassagens();
        }

}
