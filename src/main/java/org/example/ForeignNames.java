package org.example;
import com.opencsv.*;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class ForeignNames {
    public List<Person> personList = new LinkedList<>();

    public void ReadCSV(String csvFilePath){
        List<String[]> allData = null;
        try (FileReader filereader = new FileReader(csvFilePath)) {

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).withCSVParser(parser).build();
            allData = csvReader.readAll();


        } catch (Exception e) {
            e.printStackTrace();
        }
         if(allData != null) for(String[] row : allData){
            Person temp = new Person(row);
            System.out.println(temp.toString());
            personList.add(temp);
        }
    }
    public void printPersons(){
        //System.out.println();
    }
}
