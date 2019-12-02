package com.asterons.springframe.sfgpetclinic.services.map;

      import com.asterons.springframe.sfgpetclinic.model.Speciality;
      import com.asterons.springframe.sfgpetclinic.model.Vet;
      import com.asterons.springframe.sfgpetclinic.services.SpecialtyService;
      import com.asterons.springframe.sfgpetclinic.services.VetService;
      import org.springframework.stereotype.Service;
      import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void detele(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
