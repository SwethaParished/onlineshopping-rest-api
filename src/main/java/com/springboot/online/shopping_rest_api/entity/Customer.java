package com.springboot.online.shopping_rest_api.entity;

import jakarta.persistence.Entity;

@Entity
public class Customer {

    private int custId;
    private String custFirstName;
    private String custSecondName;
    private String custUserName;
    private String custEmail;
    private String custPassword;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustSecondName() {
        return custSecondName;
    }

    public void setCustSecondName(String custSecondName) {
        this.custSecondName = custSecondName;
    }

    public String getCustUserName() {
        return custUserName;
    }

    public void setCustUserName(String custUserName) {
        this.custUserName = custUserName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
