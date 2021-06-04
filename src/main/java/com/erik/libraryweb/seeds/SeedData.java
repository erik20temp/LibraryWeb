package com.erik.libraryweb.seeds;

import com.erik.libraryweb.repositories.AuthorRepository;
import com.erik.libraryweb.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;

public class SeedData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public SeedData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
