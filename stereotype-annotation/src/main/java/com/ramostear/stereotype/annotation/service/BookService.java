package com.ramostear.stereotype.annotation.service;

import com.ramostear.stereotype.annotation.entity.Book;

import java.util.List;

public interface BookService {
    Book add(Book book);
    boolean delete(Integer id);
    Book findById(Integer id);
    Book update(Book book);
    List<Book> findAll();
}
