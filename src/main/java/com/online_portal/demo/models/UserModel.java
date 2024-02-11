package com.online_portal.demo.models;

import com.online_portal.demo.enums.Role;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;
    private String firstname;
    private String Lastname;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role userRole;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
