package org.compain.clientui.service;

import lombok.Data;
import org.compain.clientui.consumer.BookProxy;
import org.compain.clientui.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class BookService {

    @Autowired
    private BookProxy bookProxy;

    public List<Book> getBooks(){
        return bookProxy.getBooks();
    }
}
