package com.dao;

import com.model.Registration;

import java.util.List;

public interface RegistrationDao {
    public List<Registration> getAll();
    public Registration get(int id);
    public void update(Registration registration);
    public void delete(int id);
}
