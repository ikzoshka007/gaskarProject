package com.example.gaskar.service.impl;

import com.example.gaskar.core.abstraction.CrudServiceAbstract;
import com.example.gaskar.model.Certificate;
import com.example.gaskar.repository.CertificateRepository;
import com.example.gaskar.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CertificateServiceImpl extends CrudServiceAbstract<Certificate> implements CertificateService {

  private final CertificateRepository certificateRepository;

  @Override
  public JpaRepository<Certificate, Long> getRepository() {

    return certificateRepository;
  }
}
