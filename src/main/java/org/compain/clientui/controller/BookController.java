package org.compain.clientui.controller;

import org.compain.clientui.model.Book;
import org.compain.clientui.model.FilterResearch;
import org.compain.clientui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/api/books")
    public String books(@CookieValue(value = "tokenCookie", defaultValue = "Atta") String token, Model model){
        List<Book> books = bookService.getBooks(token);
        model.addAttribute("books", books);
        return "books";
    }

    @RequestMapping(value="/api/books/book/{idBook}", method = RequestMethod.GET)
    public String getBook(@CookieValue (value = "tokenCookie", defaultValue = "Atta") String token, Model model, @PathVariable Long idBook ){
        Book book = bookService.getBookById(token, idBook);
        model.addAttribute("book", book);
      return "bookinfo";
    }


    @RequestMapping(value = "/api/books/search", method = RequestMethod.GET)
    public String searchBooks(Model model) {
        FilterResearch filterResearch = new FilterResearch();
        model.addAttribute("filters", filterResearch);
        return "research";
    }
    @RequestMapping(value = "/api/books/filtered", method = RequestMethod.GET)
    public String filteredBooks(@ModelAttribute("filters")FilterResearch filterResearch, @CookieValue (value = "tokenCookie", defaultValue = "Atta") String token,  Model model) {
        List<Book> books = bookService.searchBooks(token, filterResearch);
        model.addAttribute("books", books);
        return "books";
    }
}

