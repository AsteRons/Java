package com.asterons.asterons.controllers;

import com.asterons.asterons.model.Book;
import com.asterons.asterons.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {


    private BookRepository  bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @RequestMapping("/books")
    public String getBook(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

}
