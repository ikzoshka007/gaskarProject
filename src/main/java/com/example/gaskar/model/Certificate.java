package com.example.gaskar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Certificate {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;

  private String name;
  private String code;
}
