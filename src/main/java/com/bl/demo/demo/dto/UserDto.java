package com.bl.demo.demo.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class UserDto {
    @Column(unique = true)
    @NotEmpty(message = "Cannot be empty")
    public String firstName;

    @NotEmpty(message = "Cannot be empty")
    public String lastName;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
