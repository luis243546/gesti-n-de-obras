package com.mph.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.demo.entity.Proyecto;
import com.mph.demo.service.ProyectoService;

@RestController
@RequestMapping("")
public class ProyectoController {
  @Autowired
  ProyectoService proyecto;

  @PostMapping("/")
  public Proyecto createCase(Proyecto caseCreate) {
    return proyecto.create(caseCreate);
  }

  @GetMapping("/")
  public List<Proyecto> getCase() {
    return proyecto.getAll();
  }

  @GetMapping("{id}")
  public Proyecto getCaseById(@PathVariable Long id) {
    return proyecto.getById(id);
  }



  @DeleteMapping("{id}")
  public void deleteCaseById(@PathVariable Long id) {
    proyecto.deleteById(id);
  }
}
