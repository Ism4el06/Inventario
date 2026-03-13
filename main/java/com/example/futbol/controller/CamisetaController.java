package com.example.futbol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.futbol.model.Camiseta;
import com.example.futbol.service.CamisetaService;

@Controller
@RequestMapping("/camisetas")
public class CamisetaController {

    private final CamisetaService service;

    public CamisetaController(CamisetaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("camisetas", service.getAll());
        return "list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("camiseta", new Camiseta());
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Camiseta camiseta) {
        service.save(camiseta);
        return "redirect:/camisetas";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Camiseta camiseta = service.getById(id);
        if (camiseta != null) {
            model.addAttribute("camiseta", camiseta);
            return "form";
        }
        return "redirect:/camisetas";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/camisetas";
    }
}
