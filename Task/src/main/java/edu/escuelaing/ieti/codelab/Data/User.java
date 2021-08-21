package edu.escuelaing.ieti.codelab.Data;

import edu.escuelaing.ieti.codelab.Dto.UserDto;

import java.util.Date;
import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private Date createdAt;

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        this.createdAt = userDto.getCreatedAt();
    }

    public User(String id, UserDto userDto) {
        this.id = id;
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        this.createdAt = userDto.getCreatedAt();
    }

    public User(String id, String name, String lastName, String email, Date createdAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
