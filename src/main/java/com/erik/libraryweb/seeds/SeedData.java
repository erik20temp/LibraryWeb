package com.erik.libraryweb.seeds;

import com.erik.libraryweb.models.Author;
import com.erik.libraryweb.models.Book;
import com.erik.libraryweb.models.Publisher;
import com.erik.libraryweb.repositories.AuthorRepository;
import com.erik.libraryweb.repositories.BookRepository;
import com.erik.libraryweb.repositories.PublisherRepository;
import com.erik.libraryweb.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
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

        System.out.println("Bootstrap started");

        Publisher publisher = new Publisher();
        publisher.setName("ABC Publisher");
        publisher.setAddress("Main Str.");
        publisher.setCity("Hamburg");
        publisher.setPlz("21029");

        publisherRepository.save(publisher);
        System.out.println("Publisher count: " + publisherRepository.count());

        Author tom = new Author("Tom", "Clancy");
        Book rainbow = new Book("Rainbow Six", "7658901");
        tom.getBooks().add(rainbow);
        rainbow.getAuthors().add(tom);
        rainbow.setPublisher(publisher);
        publisher.getBooks().add(rainbow);
        authorRepository.save(tom);
        bookRepository.save(rainbow);
        publisherRepository.save(publisher);

        Author robert = new Author(
                "Robert",
                "Ladlum"
        );

        Book bourne = new Book(
                "Jason Bourne",
                "1234567"
        );
        robert.getBooks().add(bourne);
        bourne.getAuthors().add(robert);
        bourne.setPublisher(publisher);
        publisher.getBooks().add(bourne);
        authorRepository.save(robert);
        bookRepository.save(bourne);
        publisherRepository.save(publisher);

        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());

    }
}
