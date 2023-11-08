package com.mph.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.demo.entity.Tipo_de_Obra;
import com.mph.demo.service.Tippo_de_ObraService;
@RestController
public class Tipo_de_ObraController {
    @Autowired
  Tippo_de_ObraService obra;

  @PostMapping("/")
  public Tipo_de_Obra createCase(Tipo_de_Obra caseCreate) {
    return obra.create(caseCreate);
  }

  @GetMapping("/")
  public List<Tipo_de_Obra> getCase() {
    return obra.getAll();
  }

  @GetMapping("{id}")
  public Tipo_de_Obra getCaseById(@PathVariable Long id) {
    return obra.getById(id);
  }



  @DeleteMapping("{id}")
  public void deleteCaseById(@PathVariable Long id) {
    obra.deleteById(id);
  }
}
