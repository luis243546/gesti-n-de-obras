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
import com.mph.demo.service.ObreroService;
import com.mph.demo.shared.BaseService;

public class ObreroController {
  @Autowired
  ObreroService obrero;

  @PostMapping("/")
  public Obrero createCase(Obrero caseCreate) {
    return obrero.create(caseCreate);
  }

  @GetMapping("/")
  public List<Obrero> getCase() {
    return obrero.getAll();
  }

  @GetMapping("{id}")
  public Obrero getCaseById(@PathVariable Long id) {
    return obrero.getById(id);
  }

  @PutMapping("{id}")
  public Obrero putCaseById(@PathVariable Long id, @RequestBody EvidenceEntity evidence) {
    return obrero.updateEvidence(id, evidence);
  }

  @DeleteMapping("{id}")
  public void deleteCaseById(@PathVariable Long id) {
    obrero.deleteById(id);
  }
}
