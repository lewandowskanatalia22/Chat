package com.mojafirma.model.servlet;

import com.google.common.base.Strings;
import com.mojafirma.model.chatDao.Tweet;
import com.mojafirma.model.service.TweetService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PublishServlet {
    public static final String AUTHOR_COOKIE="author-cookie";
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

        String author = (String) req.getParameter("nick");
        String message = (String) req.getParameter("message");

        if (Strings.isNullOrEmpty(author) && Strings.isNullOrEmpty(message)) {
            // resp.getWriter().print("brak autora lub wiadomości.");
            resp.sendRedirect("/publish.jsp?error");
        } else {
            Cookie authorCookie= new Cookie(AUTHOR_COOKIE, author);
            authorCookie.setMaxAge(900);
            resp.addCookie(authorCookie);

            Tweet meTweet = new Tweet();
            meTweet.setDate_time();
            meTweet.setMessage("ajajaja");
            meTweet.setUser_id(1);

            service.addTweet(meTweet);
            resp.sendRedirect("/index.jsp");
        }

    }
}
