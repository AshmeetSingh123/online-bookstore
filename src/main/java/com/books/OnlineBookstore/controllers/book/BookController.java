package com.books.OnlineBookstore.controllers.book;

import com.books.OnlineBookstore.models.book.BookBean;
import com.books.OnlineBookstore.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public String createBook(@RequestHeader("custom-auth") String customAuthHeader,
                             @RequestBody BookBean book){
        return bookService.save(book);
    }

    @GetMapping("/findAll")
    public List<BookBean> fetchBooks(@RequestHeader("custom-auth") String customAuthHeader){
        return bookService.findAll();
    }

    @GetMapping("/findById/{id}")
    public BookBean fetchBookById(@RequestHeader("custom-auth") String customAuthHeader,
                                  @PathVariable(name = "id") String id){
        return bookService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteBookById(@RequestHeader("custom-auth") String customAuthHeader,
                                  @PathVariable(name = "id") String id){
        bookService.deleteById(id);
    }

}
