package com.dao;

import com.model.Login;

import java.util.List;

public interface LoginDao {
    public List<Login> getAll();
    public Login get(String username);
    public void update(Login login);
}
