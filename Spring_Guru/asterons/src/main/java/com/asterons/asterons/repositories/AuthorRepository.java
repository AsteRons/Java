package com.asterons.asterons.repositories;

import com.asterons.asterons.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
