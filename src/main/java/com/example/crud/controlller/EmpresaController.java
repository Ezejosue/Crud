package com.example.crud.controlller;

import com.example.crud.repository.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Empresa")
public class EmpresaController {

  @Autowired
  private Empresa empresa;

  @GetMapping
  public Iterable<com.example.crud.models.Empresa> empresaList(){
    return empresa.findAll();
  }

  @PostMapping
  public void setEmpresa(@RequestBody com.example.crud.models.Empresa empresaobj){
    empresa.save(empresaobj);
  }

  @PutMapping
  public void update(@RequestBody com.example.crud.models.Empresa empresaobj){
    empresa.save(empresaobj);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Integer id){
    empresa.deleteById(id);
  }
}
