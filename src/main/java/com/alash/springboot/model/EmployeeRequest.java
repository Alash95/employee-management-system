package com.alash.springboot.model;

import jakarta.persistence.Column;

public class EmployeeRequest {

    private String firstName;

    private String lastName;

    private String emailId;

    public EmployeeRequest(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public EmployeeRequest() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }
}
