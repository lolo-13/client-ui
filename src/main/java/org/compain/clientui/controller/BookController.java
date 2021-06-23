package org.compain.clientui.controller;

import org.compain.clientui.model.Book;
import org.compain.clientui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String books(@CookieValue(value = "tokenCookie", defaultValue = "Atta") String token, Model model){
        List<Book> books = bookService.getBooks(token);
        model.addAttribute("books", books);
        return "books";
    }

}

