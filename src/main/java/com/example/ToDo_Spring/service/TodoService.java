package com.example.ToDo_Spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.ToDo_Spring.repository.TodoRepository;
import com.example.ToDo_Spring.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<ToDo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<ToDo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(ToDo todo) {

    }


    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todoRepository.save(new ToDo(name, desc, targetDate, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < ToDo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(ToDo todo) {

    }

}
