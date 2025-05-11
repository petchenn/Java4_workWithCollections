package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Класс, представляющий информацию о человеке.
 * Содержит данные об идентификаторе, имени, поле, подразделении, зарплате и дате рождения.
 */
public class Person {
    /**
     * Уникальный идентификатор человека.
     */
    private int ID;
    /**
     * Имя человека.
     */
    private String name;
    /**
     * Пол человека.
     */
    private String gender;
    /**
     * Подразделение, в котором работает человек.
     */
    private Division division;
    /**
     * Зарплата человека.
     */
    private double salary;
    /**
     * Дата рождения человека.
     */
    private LocalDate dateOfBirn;
    /**
     * Конструктор класса Person.
     * Инициализирует объект Person на основе массива строк, представляющих данные о человеке.
     *
     * @param data Массив строк, содержащий данные о человеке в следующем порядке:
     *             [ID, name, gender, dateOfBirn, divisionName, salary].
     *             ID - целое число (Integer).
     *             name - строка (String).
     *             gender - строка (String).
     *             dateOfBirn - строка (String) в формате "dd.MM.yyyy".
     *             divisionName - строка (String), название подразделения.
     *             salary - целое число (Integer), зарплата.
     * @throws NumberFormatException если ID или salary не могут быть преобразованы в целое число.
     * @throws DateTimeParseException если dateOfBirn не может быть преобразована в LocalDate.
     */
    public Person(String[] data) {
        ID = Integer.parseInt(data[0]);
        name = data[1];
        gender = data[2];
        dateOfBirn = dateFromString(data[3]);
        division = new Division(data[4]);
        salary = Integer.parseInt(data[5]);
    }
    /**
     * Возвращает строковое представление объекта Person.
     * Содержит информацию об идентификаторе, имени, поле, подразделении (и его ID), зарплате и дате рождения.
     *
     * @return Строковое представление объекта Person.
     */
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
    /**
     * Возвращает идентификатор человека.
     *
     * @return Идентификатор человека.
     */
    public int getID() {
        return ID;
    }
    /**
     * Устанавливает идентификатор человека.
     *
     * @param ID Новый идентификатор человека.
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Возвращает имя человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }
    /**
     * Устанавливает имя человека.
     *
     * @param name Новое имя человека.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Возвращает пол человека.
     *
     * @return Пол человека.
     */
    public String getGender() {
        return gender;
    }
    /**
     * Устанавливает пол человека.
     *
     * @param gender Новый пол человека.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Возвращает подразделение, в котором работает человек.
     *
     * @return Подразделение, в котором работает человек.
     */
    public Division getDivision() {
        return division;
    }
    /**
     * Устанавливает подразделение, в котором работает человек.
     *
     * @param division Новое подразделение человека.
     */
    public void setDivision(Division division) {
        this.division = division;
    }
    /**
     * Возвращает зарплату человека.
     *
     * @return Зарплата человека.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает зарплату человека.
     *
     * @param salary Новая зарплата человека.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Возвращает дату рождения человека.
     *
     * @return Дата рождения человека.
     */
    public LocalDate getDateOfBirn() {
        return dateOfBirn;
    }

    /**
     * Устанавливает дату рождения человека.
     *
     * @param dateOfBirn Новая дата рождения человека.
     */
    public void setDateOfBirn(LocalDate dateOfBirn) {
        this.dateOfBirn = dateOfBirn;
    }
    /**
     * Преобразует строку, представляющую дату в формате "dd.MM.yyyy", в объект LocalDate.
     *
     * @param datum Строка, представляющая дату.
     * @return Объект LocalDate, представляющий дату, или null, если произошла ошибка при парсинге даты.
     */
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
