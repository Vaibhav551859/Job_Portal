package com.online_portal.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String firstname;
    private String Lastname;
    private String password;
    private String email;

    p

}
