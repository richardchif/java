package com.richard.practice2.taskie.service;

import com.richard.practice2.taskie.exception.UserNotFoundException;
import com.richard.practice2.taskie.model.Task;
import com.richard.practice2.taskie.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task){
        task.setTaskCode(UUID.randomUUID().toString());
        return taskRepo.save(task);
    }
    public List<Task> findAllTasks(){
        return taskRepo.findAll();
    }
    public Task updateTask(Task task){
        return taskRepo.save(task);
    }
    public void deleteTask(Long id){
        taskRepo.deleteTaskById(id);
    }

    public Task findTaskById(Long id){
        return taskRepo.findTaskById(id).orElseThrow(()-> new UserNotFoundException("Task "+id+"not found"));
    }
}
