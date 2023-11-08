package com.mph.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



import com.mph.demo.entity.Usuario;

import com.mph.demo.service.UsuarioService;

public class UsuarioController {
@Autowired
  UsuarioService usuario;

  @PostMapping("/")
  public Usuario createCase(Usuario caseCreate) {
    return usuario.create(caseCreate);
  }

  @GetMapping("/")
  public List<Usuario> getCase() {
    return usuario.getAll();
  }

  @GetMapping("{id}")
  public Usuario getCaseById(@PathVariable Long id) {
    return usuario.getById(id);
  }



  @DeleteMapping("{id}")
  public void deleteCaseById(@PathVariable Long id) {
    usuario.deleteById(id);
  }
}
