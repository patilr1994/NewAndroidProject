package com.example.rahul.recyclerviewdemo.domain;

/**
 * Created by Rahul on 26-Apr-17
 */

public class Enquiry {
    private String studName;
    private String courseName;

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getCourceName() {
        return courseName;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "studName='" + studName + '\'' +
                "' courceName='" + courseName + '\'' +
                '}';
    }
}
