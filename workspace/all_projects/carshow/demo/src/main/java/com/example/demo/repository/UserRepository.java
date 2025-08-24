package com.example.demo.repository;
import com.example.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


    public interface UserRepository extends CrudRepository<User, Long> {
         List<User> findByUsername(String username);

    }


