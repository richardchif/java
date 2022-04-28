package com.richard.practice2.taskie.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false,nullable = false)
    private Long id;
    private String title;
    private String task;
    private String startDate;
    private String dueDate;
    @Column(updatable = false,nullable = false)
    private String taskCode;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public Task(){}

    public Task(String title, String task, String startDate, String dueDate){
        this.title = title;
        this.task = task;
        this.startDate =startDate;
        this.dueDate = dueDate;
    }

    @Override
    public  String toString(){
        return  "Task {" +
                "id ="+ id +
                ", title ='"+ title +'\''+
                ", task ='"+task + '\''+
                ", startDate ='"+startDate+'\''+
                ", dueDate ='"+dueDate+'\''+
                '}';

    }


}
