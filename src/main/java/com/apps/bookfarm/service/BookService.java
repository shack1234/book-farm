package com.apps.bookfarm.service;

import com.apps.bookfarm.model.Author;
import com.apps.bookfarm.model.Book;

public interface BookService {
    public Iterable<Book> getBooks();
    public void addNewBook(Book book);

    public void removeBook(Long id);

    void addNewAuthor(Book book);

    void removeBook(int id);
}


