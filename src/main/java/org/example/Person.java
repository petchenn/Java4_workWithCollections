package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Person {
    private int ID;
    private String name;
    private String gender;
    private Division division;
    private double salary;
    private LocalDate dateOfBirn;

    public Person(String[] data) {
        ID = Integer.parseInt(data[0]);
        name = data[1];
        gender = data[2];
        dateOfBirn = dateFromString(data[3]);
        division = new Division(data[4]);
        salary = Integer.parseInt(data[5]);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", division=" + division.getName() +
                ", divisionID=" + division.getId() +
                ", salary=" + salary +
                ", birth=" + dateOfBirn +
                '}';
    }

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

    private LocalDate dateFromString(String datum) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            return LocalDate.parse(datum, formatter);
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка при парсинге даты: " + e.getMessage());
            return null;
        }
    }
}
