package com.example.demo.repository;


import com.example.demo.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByTitle(String title);
    List<Task> findByDescription(String description);




}