package com.dao;

import com.model.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RegistrationDaoImpl implements RegistrationDao{
    private SessionFactory sessionFactory;

    @Autowired
    public RegistrationDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }

    @Override
    @Transactional
    public List<Registration> getAll() {
        Session session=sessionFactory.getCurrentSession();
        Query<Registration> bookQuery=session.createQuery("from Registration", Registration.class);
        List<Registration> registrations=bookQuery.getResultList();
        return registrations==null? new ArrayList<Registration>():registrations;
    }

    @Override
    @Transactional
    public Registration get(int id) {
        Session session=sessionFactory.getCurrentSession();
        Registration registration=session.get(Registration.class,id);
        return registration;
    }

    @Override
    @Transactional
    public void update(Registration registration) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(registration);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session=sessionFactory.getCurrentSession();
        Registration registration=session.byId(Registration.class).load(id);
        session.delete(registration);
    }
}
