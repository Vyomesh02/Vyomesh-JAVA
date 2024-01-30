package com.learn.mycart.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

public class ForgotDao {

    public User checkEmail(String email) {
        try (Session session = FactoryProvider.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            User user = session.createQuery("FROM User WHERE userEmail = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResult();

            transaction.commit();

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public int resetPassword(User user) {
        int result = 0;
        try (Session session = FactoryProvider.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            session.update(user);

            transaction.commit();

            result = 1; // Assuming the update operation was successful
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
