package org.compain.clientui.controller;

import org.compain.clientui.model.Book;
import org.compain.clientui.model.Borrowing;
import org.compain.clientui.model.UserLogin;
import org.compain.clientui.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @GetMapping("/api/borrowings/user")
    public String books(@CookieValue(value = "tokenCookie", defaultValue = "Atta") String token, Model model){
        Borrowing infoborrowing = new Borrowing();
        List<Borrowing> borrowings = borrowingService.getUserBorrowing(token);
        model.addAttribute("borrowings", borrowings);
        model.addAttribute("infosborrowing", infoborrowing);
        return "userBorrowing";
    }

    @RequestMapping(value="/api/borrowings/borrowing-prolongation", method = RequestMethod.POST)
    public String getBook(@CookieValue (value = "tokenCookie", defaultValue = "Atta") String token, @ModelAttribute("infosborrowing") Borrowing borrowing ){
        borrowingService.renewalBorrowing(token, borrowing.getIdBorrowing());
        return "userBorrowing";
    }
}
