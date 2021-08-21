package edu.escuelaing.ieti.codelab.Dto;

import edu.escuelaing.ieti.codelab.Data.TaskEnum;
import edu.escuelaing.ieti.codelab.Data.User;

import java.util.Date;

public class TaskDto {
    private String name;
    private String description;
    private TaskEnum status;
    private UserDto assignedTo;
    private Date dueDate;
    private Date created;

    public TaskDto(String name, String description, TaskEnum status, UserDto assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskEnum getStatus() {
        return status;
    }

    public void setStatus(TaskEnum status) {
        this.status = status;
    }

    public UserDto getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(UserDto assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
