package com.online_portal.demo.models;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="Employer")
public class EmployerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployerId;
    private String firstname;
    private String Lastname;
    private String Userid;
    private String password;
    private boolean save;
    public int getEmployerId(int EmployerId){
        return EmployerId;
    }
    public void setEmployerId(int EmployerId){
        this.EmployerId=EmployerId;
    }


}
