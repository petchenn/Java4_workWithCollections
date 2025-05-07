package org.example;

import java.time.LocalDate;

public class Person {
    private int ID;
    private String name;
    private String gender;
    private Division division;
    private double salary;
    private LocalDate dateOfBirn;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirn() {
        return dateOfBirn;
    }

    public void setDateOfBirn(LocalDate dateOfBirn) {
        this.dateOfBirn = dateOfBirn;
    }
}
