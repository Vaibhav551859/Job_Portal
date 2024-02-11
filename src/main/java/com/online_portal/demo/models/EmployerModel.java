package com.online_portal.demo.models;

import com.online_portal.demo.enums.Role;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
@Table(name = "employers")
public class EmployerModel extends UserModel{
    public EmployerModel(){
        this.setUserRole(Role.EMPLOYER);
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employer",orphanRemoval = true)
    private List<JobModel> jobs;



}
