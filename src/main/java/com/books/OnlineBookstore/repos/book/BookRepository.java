package com.books.OnlineBookstore.repos.book;

import com.books.OnlineBookstore.models.book.BookBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<BookBean, String> {
}
