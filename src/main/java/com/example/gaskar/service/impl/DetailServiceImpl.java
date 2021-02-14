package com.example.gaskar.service.impl;

import com.example.gaskar.core.abstraction.CrudServiceAbstract;
import com.example.gaskar.model.Detail;
import com.example.gaskar.repository.DetailRepository;
import com.example.gaskar.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetailServiceImpl extends CrudServiceAbstract<Detail> implements DetailService {

  private final DetailRepository detailRepository;

  @Override
  public JpaRepository<Detail, Long> getRepository() {

    return detailRepository;
  }
}
