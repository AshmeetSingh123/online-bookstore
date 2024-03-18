package com.books.OnlineBookstore.services.book.impl;

import com.books.OnlineBookstore.models.book.BookBean;
import com.books.OnlineBookstore.repos.book.BookRepository;
import com.books.OnlineBookstore.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repo;
    @Override
    public String save(BookBean book) {
        return repo.save(book).getIsbn();
    }

    @Override
    public List<BookBean> findAll() {
        return repo.findAll();
    }

    @Override
    public BookBean findById(String id) {
        Optional<BookBean> result = repo.findById(id);
        if(result != null && result.isPresent()){
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(String id) {
        repo.deleteById(id);
    }
}
