package com.asterons.springframe.sfgpetclinic.services;

import com.asterons.springframe.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
