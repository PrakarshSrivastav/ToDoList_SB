package com.example.ToDo_Spring.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;
import com.example.ToDo_Spring.model.ToDo;

public interface ITodoService {

    List <ToDo > getTodosByUser(String user);

    Optional < ToDo > getTodoById(long id);

    void updateTodo(ToDo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(ToDo todo);
}
