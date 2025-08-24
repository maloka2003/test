package com.example.demo.service;

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Taskservice {
    private  final TaskRepository taskRepository ;
    @Autowired
    private  UserRepository userRepository;

    public Taskservice(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }
    public Task CreateTask(Task task) {
        String userName = "name";

        List<User> user= userRepository.findByUsername(userName);

        if(user==null){
            throw new RuntimeException("User not found");
        }
        else {
            task.setUser(user.get(0));
            return taskRepository.save(task);
        }
    }


}
