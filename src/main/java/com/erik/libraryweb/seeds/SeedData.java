package com.erik.libraryweb.seeds;

import com.erik.libraryweb.repositories.AuthorRepository;
import com.erik.libraryweb.repositories.BookRepository;
import com.erik.libraryweb.repositories.PublisherRepository;
import com.erik.libraryweb.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;

public class SeedData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final StudentRepository studentRepository;

    public SeedData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, StudentRepository studentRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
