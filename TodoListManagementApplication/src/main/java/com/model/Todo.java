package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "todo",schema = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    @NotNull(message = "Can not be empty")
    private String name;

    @Column(name="description")
    @NotNull(message = "Can not be empty")
    private String description;

    @Column(name="tergetDate")
    @NotNull(message = "Can not be empty")
    private String tergetDate;

    public Todo() {
    }

    public Todo(int id, String name, String description, String tergetDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tergetDate = tergetDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTergetDate() {
        return tergetDate;
    }

    public void setTergetDate(String tergetDate) {
        this.tergetDate = tergetDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tergetDate='" + tergetDate + '\'' +
                '}';
    }
}

