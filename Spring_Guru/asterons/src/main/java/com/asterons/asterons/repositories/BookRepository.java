package com.asterons.asterons.repositories;

import com.asterons.asterons.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
