package org.example;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/foreign_names.csv";
        ForeignNames foreignNames = new ForeignNames();
        foreignNames.ReadCSV(filePath);
    }
}