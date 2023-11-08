package com.mph.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mph.demo.entity.Obrero;
import com.mph.demo.entity.Usuario;
import com.mph.demo.service.ObreroService;
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

  @PutMapping("{id}")
  public Usuario putCaseById(@PathVariable Long id, @RequestBody EvidenceEntity evidence) {
    return usuario.updateEvidence(id, evidence);
  }

  @DeleteMapping("{id}")
  public void deleteCaseById(@PathVariable Long id) {
    usuario.deleteById(id);
  }
}
