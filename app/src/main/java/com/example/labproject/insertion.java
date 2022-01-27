package com.example.labproject;

public class insertion {
    public insertion(String name, String section, String department, String cgpa) {
        this.name = name;
        this.section = section;
        this.department = department;
        this.cgpa = cgpa;
    }

    String name, section, department, cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }
}
