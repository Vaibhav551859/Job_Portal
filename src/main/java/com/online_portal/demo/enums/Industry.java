package com.online_portal.demo.enums;

public enum Industry {
    BANKING("Banking"),
    FINANCE("Finance"),
    MARKETING("Marketing"),
    INFORMATION_TECHNOLOGY("Information Technology");

    private String name;

    Industry(String s){
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
