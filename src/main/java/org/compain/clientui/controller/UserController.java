package org.compain.clientui.controller;

import org.compain.clientui.model.UserLogin;
import org.compain.clientui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/connexion/login", method = RequestMethod.GET)
    public String identificationPage(Model model) {
        UserLogin userLogin = new UserLogin();
        model.addAttribute("userlogin", userLogin);
        return "connexion";
    }

    @RequestMapping(value = "/connexion/login", method = RequestMethod.POST)
    public String identification(@ModelAttribute("userlogin") UserLogin userLogin, HttpServletResponse response) {
        response.addCookie(userService.getToken(userLogin));
        return "home";
    }
}
