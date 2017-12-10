package com.mojafirma.model.chatDao;

import com.mojafirma.model.util.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {
    public Integer addUser(User user) {

        Session session = HibernateUtility.getHibernateSession().getSessionFactory().openSession();
        Transaction tx = null;
        Integer userID = null;

        try {
            tx = session.beginTransaction();
            userID = (Integer) session.save(user);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();

        }
        return userID;
    }
}
