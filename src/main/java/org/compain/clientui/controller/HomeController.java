package org.compain.clientui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/accueil"})
    public String accueil() {
        return "accueil";
    }
}
