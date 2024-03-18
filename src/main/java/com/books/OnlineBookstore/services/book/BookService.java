package com.books.OnlineBookstore.services.book;

import com.books.OnlineBookstore.models.book.BookBean;

import java.util.List;

public interface BookService {
    String save(BookBean book);

    List<BookBean> findAll();

    BookBean findById(String id);

    void deleteById(String id);
}
