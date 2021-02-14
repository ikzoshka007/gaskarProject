package com.example.gaskar.core.abstraction;

import javassist.NotFoundException;
import lombok.SneakyThrows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public abstract class CrudServiceAbstract<T> {

  public List<T> getAll() {

    JpaRepository<T, Long> repository = getRepository();

    return repository.findAll();
  }

  @SneakyThrows
  public T get(Long entityId) {

    JpaRepository<T, Long> repository = getRepository();
    Optional<T> optional = repository.findById(entityId);

    return optional.orElseThrow(() -> new NotFoundException("entityId"));
  }

  @Transactional
  public T create(T entity) {

    if (entity == null) {
      throw new IllegalArgumentException("Entity is null");
    }

    JpaRepository<T, Long> repository = getRepository();

    return repository.save(entity);
  }

  @Transactional
  public T delete(Long entityId) {

    T deletedEntity = get(entityId);

    JpaRepository<T, Long> repository = getRepository();
    repository.deleteById(entityId);

    return deletedEntity;
  }

  public boolean exists(Long entityId) {

    JpaRepository<T, Long> repository = getRepository();

    return repository.existsById(entityId);
  }

  public abstract JpaRepository<T, Long> getRepository();
}