package com.aula.front.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class usuariocontroller {

    @GetMapping("home")
    public String usuariocontroller(Model model) {// model é atributo do springboot}

        return "primeiraPagina";
    }

    @GetMapping("/login ")
    public String loginUsuario() {
        return "login";
    }

    @PostMapping("/create")
    public String cadastroUsuario(Model model, Pessoa pessoa){

        model.addAttribute("pessoa", pessoa);





        return "candidate/info";
    }

    record Pessoa (String nome, String email, String usuario){}
}
