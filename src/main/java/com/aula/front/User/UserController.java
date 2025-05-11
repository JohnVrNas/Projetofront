package com.aula.front.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pessoa", new UserModel());
        return "cadastro";
    }

    @PostMapping("/usuarios")
    public String salvarUsuario(@ModelAttribute("pessoa") UserModel pessoa) {
        userRepository.save(pessoa);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", userRepository.findAll());
        return "usuarios";
    }
}
