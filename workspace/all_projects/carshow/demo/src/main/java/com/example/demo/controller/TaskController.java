
package com.example.demo.controller;

import com.example.demo.entities.Task;
import com.example.demo.service.Taskservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final Taskservice taskService;
    public TaskController(Taskservice taskService) {

        this.taskService =  taskService;
    }


    @PostMapping
    public  Task CreateTask(@RequestBody Task task){
        return taskService.CreateTask(task);
    }
}