package com.babbar.learning.todoApp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class TodoItems {

    private long id;
    @NotBlank
    private String title;
    private Boolean done;

    public TodoItems() {
    }

    public TodoItems(long id, String title, Boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
