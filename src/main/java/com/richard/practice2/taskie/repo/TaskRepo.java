package com.richard.practice2.taskie.repo;

import com.richard.practice2.taskie.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepo extends JpaRepository<Task,Long> {
    Optional<Task>  findTaskById(Long id);
    void deleteTaskById(Long id);
}
