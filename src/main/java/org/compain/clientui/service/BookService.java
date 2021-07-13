package org.compain.clientui.service;

import lombok.Data;
import org.compain.clientui.consumer.BookProxy;
import org.compain.clientui.model.Book;
import org.compain.clientui.model.FilterResearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Data
@Service
public class BookService {

    @Autowired
    private BookProxy bookProxy;

    public List<Book> getBooks(String token){
        return bookProxy.getBooks(token);
    }

    public List<Book> searchBooks(String token, FilterResearch filterResearch) {

        Map<String, String> uriParam = new HashMap<>();
            uriParam.put("title", filterResearch.getTitle());
            uriParam.put("authorName", filterResearch.getAuthorName());
            uriParam.put("category", filterResearch.getCategory());
        return bookProxy.search(token, uriParam);
    }
    public Book getBookById(String token, Long idBook){
        return bookProxy.getBookById(token, idBook);
    }
}
