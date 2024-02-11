package com.online_portal.demo.enums;

public enum EmploymentType {
    FULL_TIME("Full time"),
    CONTRACT("Contract"),
    INTERNSHIP("Internship");


    private String name;

    EmploymentType(String s){
        this.name=s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}


