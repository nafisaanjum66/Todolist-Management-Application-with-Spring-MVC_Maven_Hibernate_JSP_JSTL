package com.dao;

import com.model.Todo;

import java.util.List;

public interface TodoDao {
    public List<Todo> getAll();
    public Todo get(int id);
    public void update(Todo todo);
    public void delete(int id);

}
