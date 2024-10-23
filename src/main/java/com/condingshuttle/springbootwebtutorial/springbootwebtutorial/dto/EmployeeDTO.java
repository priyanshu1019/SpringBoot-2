package com.condingshuttle.springbootwebtutorial.springbootwebtutorial.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private String name;
    private String email;
    private Long id;
    private Boolean isActive;
    private Integer age;
    private LocalDate dateOfJoining;

    public EmployeeDTO(){

    }
    public EmployeeDTO(String name, String email, Long id, Boolean isActive, Integer age, LocalDate dateOfJoining) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.isActive = isActive;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
