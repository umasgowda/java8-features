package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Describe the techniques that you would use to process input from a comma separated file (employee.csv) in order to
 * display on the console only the information relevant for the company telephone extension list.
 * Each row in the file will be in the format:
 * first name,last name, position held, starting date, telephone extension, salary
 */
public class ReadCsvFile {
    private static final String FILE_PATH = "/Users/umashivalingaiah/dev/learning-java8/src/main/resources/employee.csv";
    public static void main(String[] args) {
        try {
            List<List<String>> records = new ArrayList<>();
            String lines = readFile();
            if (lines != null) {
                String[] values = lines.split(",");
                records.add(Arrays.asList(values));
                records.stream().map(rowRecord -> rowRecord.get(4)).forEach(telephoneWithExtension -> {
                    System.out.println(telephoneWithExtension);
                    String[] telephoneParts = telephoneWithExtension.split(" ");
                    System.out.println("telephone number " + telephoneParts[0]);
                    System.out.println("extension " + telephoneParts[1]);
                });
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
        } catch (IOException e) {
            System.out.println("Io Exception thrown ");
        }
    }

    private static String readFile() throws IOException {
        File file = new File(FILE_PATH);
        BufferedReader br = new BufferedReader(new FileReader(file));
        return br.readLine();
    }

}
