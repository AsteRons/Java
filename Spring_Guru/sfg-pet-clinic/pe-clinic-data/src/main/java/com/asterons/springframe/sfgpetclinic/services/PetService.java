package com.asterons.springframe.sfgpetclinic.services;

import com.asterons.springframe.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
