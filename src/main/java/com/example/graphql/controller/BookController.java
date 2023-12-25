package com.example.graphql.controller;

import com.example.graphql.dto.BookInput;
import com.example.graphql.entity.Book;
import com.example.graphql.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookService.getBook(Long.parseLong(id));
    }

    @MutationMapping
    public Book saveBook(@Argument BookInput input) {
        return bookService.createBook(input.getTitle(), input.getAuthor());
    }

}