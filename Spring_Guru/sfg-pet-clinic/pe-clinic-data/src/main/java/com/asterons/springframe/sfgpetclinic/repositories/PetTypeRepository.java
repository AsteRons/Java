package com.asterons.springframe.sfgpetclinic.repositories;

import com.asterons.springframe.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
