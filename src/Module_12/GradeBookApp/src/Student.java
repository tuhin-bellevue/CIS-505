import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class Student {

    private String firstName;
    private String lastName;
    private String course;
    private String grade;

 public Student() {
    }


    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }

    private static String filePath = "grades.csv";

    public static void writeDataToCSV(String[] data)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = { "firstName", "lastName", "course", "grade" };
            writer.writeNext(header);

            // add data to csv
            writer.writeNext(data);
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readDataFromCSV()
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File("grades.csv");
        try {
            // create FileWriter object with file as parameter
            FileReader inputfile = new FileReader(file);

            // create CSVWriter object filewriter object as parameter
            CSVReader reader = new CSVReader(inputfile);

            List<String[]> fileContent = reader.readAll();

           reader.close();
           return fileContent;
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    

    @Override
    public String toString() {
        return "Student1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    
}
