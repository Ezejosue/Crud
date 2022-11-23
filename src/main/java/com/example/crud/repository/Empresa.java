package com.example.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empresa extends CrudRepository<com.example.crud.models.Empresa, Integer> {

}
