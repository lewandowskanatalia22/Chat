package com.mojafirma.model.service;

import com.mojafirma.model.chatDao.Tweet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TweetService  {

    private static TweetService _instance;
    private List<Tweet> tweetList;

    private TweetService() {
        tweetList = new LinkedList<Tweet>();
    }

    public static TweetService getInstance() {
        if (_instance == null) {
            _instance = new TweetService();
        }
        return _instance;
    }

    public void addMessage(Tweet message) {
        tweetList.add(message);
    }

    public List<Tweet> getMessagesList() {
        return Collections.unmodifiableList(tweetList);
    }
}
