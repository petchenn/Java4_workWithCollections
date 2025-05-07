package org.example;

public class Division {
    private static int _counter = 0;
    private final int id;
    private String name;

    public Division() {
        this.id = _counter++;
    }

    public static int get_counter() {
        return _counter;
    }

    public static void set_counter(int _counter) {
        Division._counter = _counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
