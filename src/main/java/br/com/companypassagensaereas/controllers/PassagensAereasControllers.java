package br.com.companypassagensaereas.controllers;

import br.com.companypassagensaereas.domain.PassagensAereas;
import br.com.companypassagensaereas.services.PassagensAereasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PassagensAereasControllers {

    @GetMapping("/cadastro-passagens")
    public String cadastroPassagens(Model model) {
        model.addAttribute("passagensAereas", new PassagensAereas());
             return "views/cadastro-passagens";
    }

    @Autowired
    private PassagensAereasService passagensAereasService;

    @PostMapping("/cadastro-passagens")
    public String cadastroPassagens(@Valid PassagensAereas passagensAereas, BindingResult result) {
        if (result.hasErrors()) {
            return "views/cadastro-passagens";
        }
        passagensAereasService.salvarPassagem(passagensAereas);
        return "views/sucesso";
    }

    @GetMapping("/lista-passagens")
    public String listarPassgens(Model model) {
        List<PassagensAereas> listaPassagem = passagensAereasService.listarPassagens();
        model.addAttribute("listapassagem", listaPassagem);
        return "views/lista";
    }

}
