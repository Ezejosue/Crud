package com.example.crud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa", catalog = "empresas", schema = "")
public class Empresa {

  @Id
  @Column
  private Integer id;

  @Column
  private String name;

  @Column
  private String NIT;

  @Column
  private String fundation;

  @Column
  private String address;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNIT() {
    return NIT;
  }

  public void setNIT(String NIT) {
    this.NIT = NIT;
  }

  public String getFundation() {
    return fundation;
  }

  public void setFundation(String fundation) {
    this.fundation = fundation;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
