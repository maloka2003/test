package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


import org.springframework.data.annotation.Id;

@Entity
public class Task {
    private long id;
    private String title;
    private String description;

        private String status;
        private int dueDate;
//        @JoinColumn(name="user_ID")
//        private User user;

    public void setUser(User user) {
    }


    public enum status{
            TO_do,
            In_Progress,
            Ready_to_Review,
            Completed
        }


//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//
//        }
//
//        public int getDueDate() {
//            return dueDate;
//
//        }
//
//        public void setDueDate(int dueDate) {
//            this.dueDate = dueDate;
//
//        }


}
