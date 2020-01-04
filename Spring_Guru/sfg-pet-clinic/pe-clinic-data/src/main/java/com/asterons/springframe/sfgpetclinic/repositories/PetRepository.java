package com.asterons.springframe.sfgpetclinic.repositories;

import com.asterons.springframe.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
