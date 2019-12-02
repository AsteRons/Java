package com.asterons.springframe.sfgpetclinic.services.map;

import com.asterons.springframe.sfgpetclinic.model.Speciality;
import com.asterons.springframe.sfgpetclinic.services.SpecialtiesService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void detele(Speciality object) {
         super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
