package com.babbar.learning.todoApp.controller;


import com.babbar.learning.todoApp.model.TodoItems;
import com.babbar.learning.todoApp.repo.TodoRepo;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private TodoRepo todoRepo;


    @GetMapping
    public List<TodoItems> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItems save (@Valid @NotNull @RequestBody TodoItems todoItems){
        return todoRepo.save(todoItems);

    }

    @PutMapping
    public TodoItems update (@Valid @NotNull @RequestBody TodoItems todoItems){
        return todoRepo.save(todoItems);

    }

    @DeleteMapping (value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);

    }

}
