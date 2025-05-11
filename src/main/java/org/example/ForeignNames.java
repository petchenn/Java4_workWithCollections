package org.example;
import com.opencsv.*;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
/**
 * Класс для чтения данных о людях из CSV-файла и хранения их в списке.
 */
public class ForeignNames {
    /**
     * Список объектов Person, содержащих данные, прочитанные из CSV-файла.
     */
    public List<Person> personList = new LinkedList<>();
    /**
     * Читает данные из CSV-файла по указанному пути, создает объекты Person на основе прочитанных данных
     * и добавляет их в список personList.  Разделителем полей в CSV-файле является символ ';'.
     * Первая строка CSV-файла пропускается (считается заголовком).
     *
     * @param csvFilePath Путь к CSV-файлу, содержащему данные о людях.
     */
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
}
