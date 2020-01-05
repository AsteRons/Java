package com.asterons.springframe.sfgpetclinic.services.map;



import com.asterons.springframe.sfgpetclinic.model.PetType;
import com.asterons.springframe.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

}
