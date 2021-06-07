package com.erik.libraryweb.services;

import com.erik.libraryweb.models.Book;
import com.erik.libraryweb.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return (List<Book>) bookRepository.findAll();
    }
}
