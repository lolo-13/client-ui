package org.compain.clientui.controller;

import org.compain.clientui.model.User;
import org.compain.clientui.model.UserLogin;
import org.compain.clientui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
    public String identification(@ModelAttribute("userlogin") UserLogin userLogin, HttpServletResponse response, HttpSession session) {
        response.addCookie(userService.getToken(userLogin));
        session.setAttribute("connected", true);
        return "accueil";
    }
    @RequestMapping(value = "/connexion/signup", method = RequestMethod.GET)
    public String creationPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "createAccount";
    }
    @RequestMapping(value = "/connexion/signup", method = RequestMethod.POST)
    public String signup(@ModelAttribute("user") User user) {
       userService.save(user);
        return "accueil";
    }
}
