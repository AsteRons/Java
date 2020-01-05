package com.asterons.springframe.sfgpetclinic.services.map;

      import com.asterons.springframe.sfgpetclinic.model.Pet;
      import com.asterons.springframe.sfgpetclinic.services.CrudService;
      import com.asterons.springframe.sfgpetclinic.services.PetService;
      import org.springframework.context.annotation.Primary;
      import org.springframework.stereotype.Service;
      import java.util.Set;

      @Service
      @Primary
    public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void detele(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
