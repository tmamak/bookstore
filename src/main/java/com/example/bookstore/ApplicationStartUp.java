package com.example.bookstore;

import com.example.bookstore.catalog.application.CatalogController;
import com.example.bookstore.catalog.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ApplicationStartUp implements CommandLineRunner {
    private final CatalogController catalogController;

    @Override
    public void run(String... args) throws Exception {
        List<Book> books = catalogController.findByTitle("Pan");
        books.forEach(System.out::println);
    }
}
