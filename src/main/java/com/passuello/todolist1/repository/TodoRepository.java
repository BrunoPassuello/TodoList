package com.passuello.todolist1.repository;

import com.passuello.todolist1.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
