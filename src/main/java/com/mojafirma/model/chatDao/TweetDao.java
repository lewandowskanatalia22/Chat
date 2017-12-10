package com.mojafirma.model.chatDao;

import com.mojafirma.model.util.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TweetDao {
    public Integer addMyTweet(Tweet tweet) {

        Session session = HibernateUtility.getHibernateSession().getSessionFactory().openSession();
        Transaction tx = null;
        Integer myTweetID = null;

        try {
            tx = session.beginTransaction();
            myTweetID = (Integer)session.save(tweet);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return myTweetID;
    }
}
