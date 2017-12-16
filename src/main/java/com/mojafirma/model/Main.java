package com.mojafirma.model;

import com.mojafirma.model.chatDao.Tweet;
import com.mojafirma.model.chatDao.TweetDao;
import com.mojafirma.model.chatDao.User;
import com.mojafirma.model.chatDao.UserDao;
import com.mojafirma.model.util.HibernateUtility;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
public class Main {

    public static void main(String[] args) {

//
//
        TweetDao tweetDao = new TweetDao();
        UserDao userDao = new UserDao();
        User user1 = new User();
       Tweet tweet1 = new Tweet();
//
        user1.setNick("Olek");
        user1.setPass("ala");
       tweet1.setMessage("no cześć :)");
//
        tweet1.setDate_time(System.currentTimeMillis());
        tweet1.setUser(user1);
        userDao.addUser(user1);
        tweetDao.addMyTweet(tweet1);


    }
}

