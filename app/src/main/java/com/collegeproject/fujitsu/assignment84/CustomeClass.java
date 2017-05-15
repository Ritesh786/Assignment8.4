package com.collegeproject.fujitsu.assignment84;

import java.util.Date;

/**
 * Created by Fujitsu on 15/05/2017.
 */

public class CustomeClass {

    private String name;
    private String phone;
    private String date;

    public CustomeClass(String name, String phone, String date) {
        this.name = name;
        this.phone = phone;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
