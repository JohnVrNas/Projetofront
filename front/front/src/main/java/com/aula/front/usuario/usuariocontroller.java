package com.aula.front.usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")

public class usuariocontroller {
    //localhost:8080/nome
    @GetMapping("/home")
    public String usuariocontroller(Model model ) {// model é atributo do springboot}
        model.addAttribute("usuariocontroller", "Olá mundo");
        return "usuario";
    }

}
