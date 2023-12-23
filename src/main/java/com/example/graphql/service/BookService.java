package com.example.graphql.service;

import com.example.graphql.entity.Book;
import com.example.graphql.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(String title, String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return true;
    }
}
