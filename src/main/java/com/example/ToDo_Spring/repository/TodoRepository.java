package com.example.ToDo_Spring.repository;

import java.util.List;

import com.example.ToDo_Spring.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository <ToDo, Long > {
    List < ToDo > findByUserName(String user);
}
