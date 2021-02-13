package com.example.gaskar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Detail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column( name = "detail_code", unique = true)
  private String detailCode;

  @ManyToOne
  private Product product;

  @ManyToOne
  private Detail parentDetail;

  @OneToMany(mappedBy = "parentDetail", cascade = CascadeType.ALL)
  private List<Detail> innerDetailList;

  @OneToMany(mappedBy = "detail", cascade = CascadeType.ALL)
  private List<Certificate> certificateList;

  private int countOfUsedDetails;
}
