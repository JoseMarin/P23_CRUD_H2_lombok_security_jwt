package com.example.demo.book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
	List<Book> getAllBooks(); //get all books
    Book add(Book book); // new book
    Optional<Book> findById(Long bookId); //find book by id
    void delete(Long bookId); //delete book by id
    Book update(Book book); //update book by id
}
