package com.example.gaskar.core;

import java.util.List;

public interface CrudService<T> {

  T get(Long entityId);

  List<T> getAll();

  T create(T entity);

  boolean exists(Long entityId);

  T delete(Long entityId);
}
