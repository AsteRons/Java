package com.asterons.springframe.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findId(ID id);

    T save(T object);

    void detele(T object);

    void deleteById(ID id);
}
