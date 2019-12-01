package com.asterons.springframe.sfgpetclinic.model;

public class Speciality extends BaseEntity {

    private String description;

    public Speciality(String description) {
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
