package org.compain.clientui.service;

import org.compain.clientui.consumer.UserProxy;
import org.compain.clientui.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.io.IOException;

@Service
public class UserService {

    @Autowired
    private UserProxy userProxy;

    public Cookie getToken(UserLogin userLogin) {

        Cookie cookie = new Cookie("tokenCookie", userProxy.getToken(userLogin));
        cookie.setMaxAge(7 * 24 * 60 * 60);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setPath("/");

        return cookie;
    }
}
