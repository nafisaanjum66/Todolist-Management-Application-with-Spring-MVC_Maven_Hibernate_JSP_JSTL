package com.dao;

import com.model.Todo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDaoImpl implements TodoDao {
    private SessionFactory sessionFactory;

    @Autowired
    public TodoDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }

    @Override
    @Transactional
    public List<Todo> getAll() {
        Session session=sessionFactory.getCurrentSession();
        Query<Todo> bookQuery=session.createQuery("from Todo", Todo.class);
        List<Todo> todos=bookQuery.getResultList();
        return todos==null? new ArrayList<Todo>():todos;
    }

    @Override
    @Transactional
    public Todo get(int id) {
        Session session=sessionFactory.getCurrentSession();
        Todo todo=session.get(Todo.class,id);
        return todo;
    }

    @Override
    @Transactional
    public void update(Todo todo) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(todo);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session=sessionFactory.getCurrentSession();
        Todo todo=session.byId(Todo.class).load(id);
        session.delete(todo);
    }

}
