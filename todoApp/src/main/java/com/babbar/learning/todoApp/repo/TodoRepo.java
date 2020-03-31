package com.babbar.learning.todoApp.repo;

import com.babbar.learning.todoApp.model.TodoItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItems,Long> {



}
