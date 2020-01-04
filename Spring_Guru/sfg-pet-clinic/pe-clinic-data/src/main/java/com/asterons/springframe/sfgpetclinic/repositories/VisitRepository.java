package com.asterons.springframe.sfgpetclinic.repositories;

import com.asterons.springframe.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
